package com.wode.web;

import com.wode.domain.User;
import com.wode.cons.Common;
import org.springframework.util.Assert;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/4/16 0016.
 */
public class BaseColltroller {

    // session 存储
    public void saveSessionUser(HttpServletRequest request,User user){
        request.getSession().setAttribute(Common.USER_CONTEXT,user);
    }

    public User getSessionUser(HttpServletRequest request){
        return (User)request.getSession().getAttribute(Common.USER_CONTEXT);
    }

    public final String getAppbaseUrl(HttpServletRequest request, String url) {
        Assert.hasLength(url, "url不能为空");
        Assert.isTrue(url.startsWith("/"), "必须以/打头");
        return request.getContextPath() + url;
    }

}
