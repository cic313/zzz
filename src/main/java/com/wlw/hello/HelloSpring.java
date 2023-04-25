package com.wlw.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {
        @RequestMapping("/hello")
        public String hello(){
            System.out.println("hello springboot");
            return "请求成功";
        }
    }
