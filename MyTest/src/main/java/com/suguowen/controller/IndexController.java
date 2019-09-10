package com.suguowen.controller;

import com.suguowen.bean.Account;
import com.suguowen.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {

    @Autowired
    LoginService loginService;

    @ResponseBody
    @RequestMapping("/login")
    public void login(Account account, HttpServletRequest request, HttpServletResponse response) throws Exception{
        int result = loginService.login(account);

        switch (result){
            //登录成功
            case 1:
                response.sendRedirect("index.jsp");
                break;
            //账号不存在
            case -2:
                response.sendRedirect("error.jsp");
                break;
            //账号或密码错误
            case -1:
                response.sendRedirect("error.jsp");
                break;
        }
    }
}
