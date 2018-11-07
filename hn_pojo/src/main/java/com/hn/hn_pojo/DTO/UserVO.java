package com.hn.hn_pojo.DTO;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户信息 of date 2018-11-06 by chenyb
 */
@Data
public class UserVO implements Serializable {

    //用户名
    private String userName;
    //真实姓名
    private String rName;
    //登录密码
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "userName='" + userName + '\'' +
                ", rName='" + rName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
