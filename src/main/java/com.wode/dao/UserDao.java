package com.wode.dao;

import com.wode.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/4/16 0016.
 */
@Repository
public class UserDao extends BaseDao<User> {

    public void addUser(User user){
        getHibernateTemplate().save(user);
    }

}
