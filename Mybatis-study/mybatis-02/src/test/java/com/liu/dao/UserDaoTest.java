package com.liu.dao;

import com.liu.pojo.User;
import com.liu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userLike = mapper.getUserList();
        for (User user : userLike) {
            System.out.println(user);
        }
        sqlSession.close();

    }

}
