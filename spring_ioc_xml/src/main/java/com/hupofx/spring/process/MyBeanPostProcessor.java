package com.hupofx.spring.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.spring.process
 * @date 2022/9/9 17:37
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    //此方法在bean的生命周期初始化之前执行
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor-->后置处理器的postProcessBeforeInitialization");
        return bean;
    }

    //此方法在bean的生命周期初始化之后执行
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor-->后置处理器的postProcessAfterInitialization");
        return bean;
    }
}
