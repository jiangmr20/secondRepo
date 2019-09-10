package com.suguowen.service;

import com.suguowen.bean.Account;
import com.suguowen.dao.AccountMapper;
import com.suguowen.dao.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    AccountMapper accountMapper;
    @Autowired
    StudentMapper studentMapper;

    //登录操作
    public int login(Account account){
        Account a = accountMapper.selectByPrimaryKey(account.getUsername());
        //账号不存在
        if(a==null){
            return -2;
        }
        //账号密码错误
        if(!a.getPassword().equals(account.getPassword())){
            return -1;
        }
        //state为2则是教师账号，拥有所有权限，state为1是学生账号，只有查询权限
        if(a.getState().equals(2)){
            return 2;
        }

        return 1;
    }

    //注册操作
    public int register(Account account){

        return 1;
    }


}
