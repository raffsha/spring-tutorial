##@SpringBootApplication Annotation
   ###This annotation is a shortcut of applying 3 annotations in one statement –
@SpringBootConfiguration

    @SpringBootConfiguration is new annotation in Spring boot 2. Previously, we have been using @Configuration annotation. You can use @Configuration in place of this. Both are same thing.
    
    It indicates that a class provides Spring Boot application @Configuration. It simply means that annotated class is a configuration class and shall be scanned for further configurations and bean definitions.
    
@EnableAutoConfiguration
    
    This annotation is used to enable auto-configuration of the Spring Application Context, attempting to guess and configure beans that you are likely to need. Auto-configuration classes are usually applied based on your classpath and what beans you have defined.
    
    Auto-configuration tries to be as intelligent as possible and will back-away as you define more of your own configuration. You can always manually exclude any configuration that you never want to apply using two methods –
    
    i) Use excludeName()
    ii) Using the spring.autoconfigure.exclude property in properties file. e.g.
    
    @EnableAutoConfiguration(excludeName = {"multipartResolver","mbeanServer"})
    Auto-configuration is always applied after user-defined beans have been registered.
    
@ComponentScan

    This annotation provides support parallel with Spring XML’s context:component-scan element.
    
    Either basePackageClasses() or basePackages() may be specified to define specific packages to scan. If specific packages are not defined, scanning will occur from the package of the class that declares this annotation.