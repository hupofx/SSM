package com.hupofx.proxy;

import com.hupofx.spring.proxy.Calculator;
import com.hupofx.spring.proxy.CalculatorImpl;
import com.hupofx.spring.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.proxy
 * @date 2022/9/16 1:12
 */
public class ProxyTest {

    @Test
    public void testProxy() {
        /*CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        proxy.add(1, 2);*/

        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1,2);
    }
}
