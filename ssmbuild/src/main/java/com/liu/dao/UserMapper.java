package com.liu.dao;

import com.liu.pojo.User;
import org.apache.ibatis.annotations.Param;
public interface UserMapper {

     User queryUserByUserName(@Param("username") String username);
}
