package com.hupofx.spring.aop.xml;

import org.springframework.stereotype.Component;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.spring.proxy
 * @date 2022/9/16 0:50
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        System.out.println("方法内部，result：" + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        System.out.println("方法内部，result：" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        System.out.println("方法内部，result：" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        System.out.println("方法内部，result：" + result);
        return result;
    }
}
