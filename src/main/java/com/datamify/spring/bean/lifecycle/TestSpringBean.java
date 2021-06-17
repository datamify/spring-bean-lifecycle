package com.datamify.spring.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TestSpringBean implements InitializingBean, DisposableBean {

    private final TestSpringBeanDependency testSpringBeanDependency;

    public TestSpringBean(TestSpringBeanDependency testSpringBeanDependency) {
        this.testSpringBeanDependency = testSpringBeanDependency;
        System.out.println("TestSpringBean constructor");
    }

    @Override
    public void destroy() {
        System.out.println("TestSpringBean destroy");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("TestSpringBean afterPropertiesSet");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("TestSpringBean postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("TestSpringBean preDestroy");
    }

}
