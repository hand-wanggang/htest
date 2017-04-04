package com.hand.wanggangfrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by deep on 2017/1/23.
 */

@Controller
public class GotoController {

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String gotoHome(){
        return "home";
    }
}
