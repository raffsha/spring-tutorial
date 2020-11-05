package com.kanaex.SpringAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.kanaex.SpringAnno")
public class AppConfig {
//    @Bean
//    public Samsung getPhone(){
//        return new Samsung();
//    }
//
//    @Bean
//    public MobileProcessor getProcessor(){
//        return new Snapdragon();
//    }
    // @Bean untuk menggantikan xml berikut
//       <beans>
//        <bean id="phone" class="Samsung" />
//        <bean id="cpu" class="SnapDragon" />
//       </beans>
}
