package com.datamify.spring.bean.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class TestSpringBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (shouldOutput(beanName)) {
            System.out.println(beanName + " TestSpringBeanPostProcessor postProcessBeforeInitialization");
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (shouldOutput(beanName)) {
            System.out.println(beanName + " TestSpringBeanPostProcessor postProcessAfterInitialization");
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    private boolean shouldOutput(String beanName) {
        return "testSpringBeanDependency".equals(beanName) || "testSpringBean".equals(beanName);
    }

}
