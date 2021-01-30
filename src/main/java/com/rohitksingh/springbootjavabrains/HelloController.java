package com.rohitksingh.springbootjavabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String showHelloPage(){
        return "This is Hello Controller";
    }
}
