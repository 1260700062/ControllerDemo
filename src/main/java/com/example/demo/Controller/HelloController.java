package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    //进入hello页面
    @GetMapping("hi")
    public String hi(){
        return "hello";
    }

}
