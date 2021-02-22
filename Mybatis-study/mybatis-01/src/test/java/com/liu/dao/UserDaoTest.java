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
        List<User> userLike = mapper.getUserLike("li");
        for (User user : userLike) {
            System.out.println(user);
        }
        sqlSession.close();

    }

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserId(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int lyx = mapper.addUser(new User(7, "lyx", "12121"));
        if(lyx>0){
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
        test();
    }

    @Test
    public void upDate(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int lll = mapper.updateUser(new User(4, "yyy", "222"));
        if (lll>0){
            System.out.println("修改成功");
        }
        sqlSession.commit();
        sqlSession.close();
        test();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(3);
        if (i>0){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();
        test();
    }
}
