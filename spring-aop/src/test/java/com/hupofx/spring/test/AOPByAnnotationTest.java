package com.hupofx.spring.test;

import com.hupofx.spring.aop.annotation.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.spring.test
 * @date 2022/9/26 14:07
 */
public class AOPByAnnotationTest {

    @Test
    public void testAOPByAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(1, 1);
    }

}
