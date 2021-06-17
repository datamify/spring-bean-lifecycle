package com.datamify.spring.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TestSpringBeanDependency implements InitializingBean, DisposableBean {

    public TestSpringBeanDependency() {
        System.out.println("TestSpringBeanDependency constructor");
    }

    @Override
    public void destroy() {
        System.out.println("TestSpringBeanDependency destroy");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("TestSpringBeanDependency afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("TestSpringBeanDependency postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("TestSpringBeanDependency preDestroy");
    }

}
