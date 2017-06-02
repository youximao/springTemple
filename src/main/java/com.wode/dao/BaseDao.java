package com.wode.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

/**
 * Created by Administrator on 2017/4/16 0016.
 */
public class BaseDao<T> {
    @Autowired
    private HibernateTemplate hibernateTemplate;


    HibernateTemplate getHibernateTemplate(){
        return hibernateTemplate;
    }
    // 这是梵蒂冈广泛的广泛11
}
