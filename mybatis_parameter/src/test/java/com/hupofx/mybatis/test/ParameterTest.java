package com.hupofx.mybatis.test;

import com.hupofx.mybatis.mapper.UserMapper;
import com.hupofx.mybatis.pojo.User;
import com.hupofx.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.mybatis.test
 * @date 2022/8/23 2:00
 */
public class ParameterTest {

    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUsername("admin");
        System.out.println(user);
    }
}
