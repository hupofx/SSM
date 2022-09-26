package com.hupofx.spring.test;

import com.hupofx.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.spring.test
 * @date 2022/9/27 1:34
 */
public class AOPByXMLTest {

    @Test
    public void testAOPByXML(){
        ApplicationContext aop = new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator = aop.getBean(Calculator.class);
        calculator.add(1, 2);
    }
}
