package com.hupofx.mybatis.test;

import com.hupofx.mybatis.mapper.SpecialSQLMapper;
import com.hupofx.mybatis.pojo.User;
import com.hupofx.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.*;
import java.util.List;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.mybatis.test
 * @date 2022/8/26 14:15
 */
public class SpecialSQLMapperTest {

    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> like = mapper.getUserByLike("a");
        like.forEach(System.out::println);
    }

    @Test
    public void testDeleteMoreUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMoreUser("9,10");
    }

    @Test
    public void testGetUserList(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserList("t_user");
        list.forEach(System.out::println);
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null,"xiaoming","123456",23,"男","123@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }

    public void testJDBC(){
        try {
            Class.forName("");
            Connection connection = DriverManager.getConnection("","","");
            /*String sql = "select * from t_user where name like '%?%'";
            PreparedStatement ps = connection.prepareStatement(sql);*/
            //ps.setString(1, "a");
            String sql = "insert into t_user values()";
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.executeUpdate();
            ResultSet resultSet = ps.getGeneratedKeys();
            resultSet.next();
            int id = resultSet.getInt(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
