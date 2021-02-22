package com.liu.dao;

import com.liu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {


    User getUserById(@Param("lid") int id);
    List<User> getUserByLimit(Map<String,Integer> map);
}
