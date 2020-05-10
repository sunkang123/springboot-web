package com.spring.springbootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 广告资源位...
 *
 * @author mercyblitz
 * @date 2017-10-11
 **/
@RestController
public class IndexController {

    @RequestMapping("")
    public String index(){
        return "hello world";
    }
}
