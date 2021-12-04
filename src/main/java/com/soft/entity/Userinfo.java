package com.soft.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;


@TableName(value = "userinfo")
public class Userinfo {

    @TableId(value = "Userid", type = IdType.AUTO)
    //用户id
    public int Userid;
    //姓名

    public String Username;
    //密码
    public String Userpwd;
    //电话号码
    public String Userphone;
    //年龄
    public int Userage;
    //身份标识
    public String State;

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUserpwd() {
        return Userpwd;
    }

    public void setUserpwd(String userpwd) {
        Userpwd = userpwd;
    }

    public String getUserphone() {
        return Userphone;
    }

    public void setUserphone(String userphone) {
        Userphone = userphone;
    }

    public int getUserage() {
        return Userage;
    }

    public void setUserage(int userage) {
        Userage = userage;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
