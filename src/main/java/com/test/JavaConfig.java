package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.test")
public class JavaConfig {
    
    @Bean //애너테이션 방식
    public Student2 student() {
        return new Student2();
    }

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("KoKo");
        return p;
    }

    @Bean
    public Employee employee(){
        Employee employee = new Employee();
        employee.setAddress((address()));
        return employee;
    }
    @Bean
    public Address address(){
        return new Address();
    }
}
