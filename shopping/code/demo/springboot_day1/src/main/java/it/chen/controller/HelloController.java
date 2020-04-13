package it.chen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("user")
public class HelloController {
    @Autowired
    private DataSource dataSource;

    @GetMapping("dd")
    public String test(){

        return "hello a";
    }

}
