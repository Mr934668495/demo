package com.example.demo.controller;

import com.example.demo.beans.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @GetMapping("/test")
    public  boolean logintest(User user){
        logger.info("调用login test方法,用户名：" +user.getName()+"，密码："+user.getPassword());
        if(user.getName().equals("jzh") && user.getPassword().equals("123456")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setName("jzh");
        System.out.println(user.getName() == "jzh");
    }
}
