package com.wode.service;

import com.wode.dao.UserDao;
import com.wode.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/4/16 0016.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;


    public User getUser(int id){
        User user=new User();
        return user;
    }
}
