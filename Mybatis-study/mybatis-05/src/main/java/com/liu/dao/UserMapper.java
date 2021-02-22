package com.liu.dao;

import com.liu.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();

    //方法存在多个参数，所有的参数前而必须加上: @Param("id")注解
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);

    @Delete("delete from user where id = #{id}")
    int deleteUser(@Param("id") int id);

    @Update("update user set name = #{name},pwd = #{password} where id = #{id}")
    int updateUser(User user);
}
