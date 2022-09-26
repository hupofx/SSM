package com.hupofx.spring.factory;

import com.hupofx.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.spring.factory
 * @date 2022/9/9 18:49
 * FactoryBean是一个接口，需要创建一个类实现该接口
 * 其中有三个方法：
 * getObject()：提供一个对象交给IOC容器管理
 * getObjectType()：设置所提供对象的类型
 * isSingleton()：所提供的对象是否单例
 * 当把FactoryBean的实现类配置为bean时，会将当前类中getObject()所返回的对象交给IOC容器
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }



}
