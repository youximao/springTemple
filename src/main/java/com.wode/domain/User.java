package com.wode.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2017/3/28 0028.
 */
@Entity
@Table(name="t_user")
public class User extends BaseDomain{


    @Column(name ="name")
    private String name;

    @Column(name="password")
    private String password;
    @Id
    @Column(name="id")
    private int id;

   public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password){
       this.password=password;
    }

    public void setId(int id) {
        this.id = id;
    }


}
