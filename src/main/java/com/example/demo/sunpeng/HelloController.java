package com.example.demo.sunpeng;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
    @RequestMapping("hello")
    public String helloSpringBoot(){
        return "hello";
    }
}
