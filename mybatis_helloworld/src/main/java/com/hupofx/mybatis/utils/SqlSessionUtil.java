package com.hupofx.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.mybatis.utils
 * @date 2022/8/22 16:22
 */
public class SqlSessionUtil {

    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        //获取核心配置文件
        try {
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //获取SqlSessionFactoryBuilder对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //获取SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
            //获取SqlSession对象
            sqlSession = sqlSessionFactory.openSession(true);//不需要手动提交事务
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sqlSession;

    }
}
