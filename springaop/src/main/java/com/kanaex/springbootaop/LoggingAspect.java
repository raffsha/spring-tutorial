package com.kanaex.springbootaop;

//An aspect can be created in spring boot with help of annotations @Aspect annotation and
// registering with bean container with @Component annotation.
//
//Inside the aspect class, we can create advices as required.
// For example, below class applies around advice on methods inside all classes in package com.kanex.springbootaop.
// It captures the method start time and end time, and log the total method execution time in the log file.

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER = LogManager.getLogger(LoggingAspect.class);

//    @Around : Advice that surrounds a join point such as a method invocation.

//    @Before : Advice that executes before a join point, but which does not have the ability to prevent execution flow proceeding to the join point (unless it throws an exception).
//    @AfterReturning : Advice to be executed after a join point completes normally.
//    @AfterThrowing : Advice to be executed if a method exits by throwing an exception.

    @Around("execution(* com.kanaex.springbootaop..*(..))")
    public Object profileAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

        //Get intercepted method details
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();

        final StopWatch stopWatch = new StopWatch();

        //Measure method execution time
        stopWatch.start();
        Object result = proceedingJoinPoint.proceed();
        stopWatch.stop();

        //Log method execution time
        LOGGER.info("Execution time of " + className + "." + methodName + " "
                + ":: " + stopWatch.getTotalTimeMillis() + " ms");

        return result;
    }
}
