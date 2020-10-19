package com.kanaex.SpringBootJPAGetEntities;

import com.kanaex.SpringBootJPAGetEntities.services.ProductService;
import com.kanaex.SpringBootJPAGetEntities.services.ProductServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.kanaex.SpringBootJPAGetEntities.repositories")
@ComponentScan("com.kanaex.SpringBootJPAGetEntities")
@PropertySource("classpath:application.properties")
public class JPAConfiguration {

    @Bean
    public ProductService productService(){
        return new ProductServiceImpl();
    }
}
