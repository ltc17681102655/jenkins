package com.ltc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Auther: ltc
 * @Date: 2019/1/6 17:37
 * @Description:
 */
@RestController
public class JenkinsController {

    @GetMapping("jenkins")
    public String test() {
        return "success";
    }
}
