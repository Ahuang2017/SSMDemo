package org.lanqiao.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lanqiao.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by user on 2017/9/4.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class IUserDaoTest {

    @Autowired
    IUserDao userDao;

    @Test
    public void updateUserByCond() throws Exception {
        User user=new User();
        user.setId(4);
        user.setUsername("ht");
        userDao.updateUserByCond(user);
    }

    @Test
    public void getUserIn() throws Exception {
        User user=new User();
        List<Integer> list=new ArrayList<Integer>();
        list.add(3);
        list.add(4);
        list.add(5);
        List<User> userList=new ArrayList<User>();
        userList= userDao.getUserIn(list);
        System.out.println(userList);

      }


}