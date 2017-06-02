package com.wode.web;

import com.wode.domain.User;
import com.wode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
/**
 * Created by Administrator on 2017/3/28 0028.
 */
@Controller
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/getJson")
    public @ResponseBody String getJson( String jia){
        return "['wo'=>'wo']";
    }

    @RequestMapping("/regist1")
    public ModelAndView postRegist(@ModelAttribute("user") User user){
        ModelAndView mav= new ModelAndView();
        mav.setViewName("infoView");
        mav.addObject("user",user);

        System.out.print(user.getName());
        return mav;
    }

    @RequestMapping(path = "/user/{id}")
    public String getUserById(@PathVariable("id") int id){

        return "sdf";
    }


    @RequestMapping("getjsonid")
    @ResponseBody
    public  User getJisonid(){
        User user=new User();
        user.setId(3);
        user.setName("32");
        user.setPassword("3wefsd");
        System.out.print("erw3232");
        return user;
    }



}
