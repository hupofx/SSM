package com.hupofx.mybatis.mapper;

import com.hupofx.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author zdz
 * @version V1.0
 * @Package com.hupofx.mybatis.mapper
 * @date 2022/8/26 2:04
 */
public interface SelectMapper {

    /**
     * 若sql语句查询的结果为多条时，一定不能以实体类类型作为方法的返回值
     * 否则会抛出异常TooManyResultsException
     * 若sql语句查询的结果为一条时，此时可以使用实体类类型或list集合类型作为方法的返回值
     */

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 查询所有的用户信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 查询用户的总数量
     * @return
     */
    Integer getCount();

    /**
     * 根据id查询用户信息为map集合
     * @param id
     * @return
     */
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有的用户信息为map集合
     * 若查询的数据有多条时，并且要将每条数据转换为map集合
     * 此时有两种解决方案：
     * 1、将mapper接口方法的返回值设置为泛型是map的list集合
     * List<Map<String,Object>> getAllUserToMap();
     * 结果：{password=123456, gender=男, id=1, age=23, email=12345@qq.com, username=admin}，{password=123456, gender=男, id=1, age=23, email=12345@qq.com, username=admin}
     * 2、可以将每条数据转换的map集合放在一个大的map中，必须要通过@MapKey注解
     * 将查询的某个字段的值，作为大的map的键
     * @MapKey("id")
     * Map<String, Object> getAllUserToMap();
     * 结果：
     * * {
     * * 1={password=123456, gender=男, id=1, age=23, email=12345@qq.com, username=admin},
     * * 2={password=123456, gender=女, id=2, age=33, email=123@qq.com, username=root}
     * * }
     */
    //List<Map<String,Object>> getAllUserToMap();
    @MapKey("id")
    Map<String,Object> getAllUserToMap();
}
