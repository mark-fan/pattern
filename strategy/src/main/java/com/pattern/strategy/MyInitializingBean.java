package com.pattern.strategy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author luofan
 */
@Component
public class MyInitializingBean implements InitializingBean, CommandLineRunner, ApplicationRunner {
    @PostConstruct
    public void init() {
        System.out.println("1. 执行@PostConstruct注解的方法 - init()...");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("2. 执行实现InitializingBean接口的方法 - afterPropertiesSet()...");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("3. 执行实现ApplicationRunner接口的方法 - run(ApplicationArguments args)...");

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("4. 执行实现CommandLineRunner接口的方法 - run(String... args)...");
    }
}


