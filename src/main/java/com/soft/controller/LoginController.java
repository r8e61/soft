package com.soft.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.soft.common.R;
import com.soft.entity.Userinfo;
import com.soft.service.serviceimpl.LoginServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 登录控制器
 * */
@Controller
public class LoginController {

    @Autowired
    LoginServiceImpl loginService;

    /**
     * 跳转到登录页面
     * */
    @RequestMapping(value = "/show_login")
    public String toadminlogin(){
        return "/login";
    }

    /**
     * 转向后台管理首页
     */
    @RequestMapping(value = "/show_admin")
    public String admin(){
        return "/admin";
    }

    /**
     * 转向普通用户主页面
     */
    @RequestMapping(value = "/show_index")
    public String index(){
        return "/index";
    }
    
    /**
     * 判断用户登录是否成功
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public Object toLogin(String Username,String Userpwd){
        QueryWrapper<Userinfo> queryWrapper = new QueryWrapper<Userinfo>();
        queryWrapper.eq("Username",Username);
        Userinfo userinfo;
        userinfo = loginService.getOne(queryWrapper);
        System.out.println("1"+userinfo);
        System.out.println("password"+userinfo.getUserpwd());
        if (userinfo.getUserpwd().equals(Userpwd) && userinfo.getState().equals("0")){
            return new R("管理员验证成功","1",1,4);
        }
        if (userinfo.getUserpwd().equals(Userpwd) && userinfo.getState().equals("1")){
            return new R("登录成功","4",4,4);
        }
        if(Username==null||Userpwd==null){
            return new R("必填项不能为空","2",3,4);
        }
        return new R("验证失败","2",3,4);
    }


}
