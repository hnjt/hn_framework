package com.hn.hn_core_web.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Meng Xiaodong
 * @description ceshi
 * @date 2018/11/5
 */
@Controller
public class WebController {

    @RequestMapping("testJquery")
    public String testJquery(){
        return "index";
    }
}
