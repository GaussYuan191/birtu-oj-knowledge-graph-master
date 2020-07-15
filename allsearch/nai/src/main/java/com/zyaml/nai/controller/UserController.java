package com.zyaml.nai.controller;

import com.zyaml.nai.Exception.Resp;
import com.zyaml.nai.entry.from.AddUserFrom;
import com.zyaml.nai.entry.node.User;
import com.zyaml.nai.repository.UserCql;
import com.zyaml.nai.service.UserService.LoginService;
import com.zyaml.nai.service.UserService.RegisterService;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: birtu-oj-knowledge-graph-master 2
 * @description: 用户登入注册接口
 * @author: Gauss
 * @date: 2020-07-14 11:14
 **/
@Controller
@RequestMapping("/api/user")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private RegisterService registerService;

    @Autowired
    private LoginService loginService;

    @GetMapping("register")
    @ResponseBody
    public Resp Register(@RequestParam String username,@RequestParam String name,@RequestParam String password, User user){
        AddUserFrom userFrom = new AddUserFrom();
        userFrom.setUsername(username);
        userFrom.setName(name);
        userFrom.setPassword(password);
        return registerService.Register(userFrom);

    }

    @GetMapping("login")
    @ResponseBody
    public Resp Login(@RequestParam String username,@RequestParam String password){
        return loginService.Login(username,password);
    }

}
