package com.jiaoyiyu.homepage.controller;

import com.jiaoyiyu.util.JwtUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@RequestMapping("/index")
@Controller
public class HomepageController {

    @RequestMapping()
    public String index() {

        return "index";
    }


    @RequestMapping("/checkToken")
    @ResponseBody
        public String checkToken(String token) {
        String salt = "dsfasdfsDAFsadsadDSDDCVeawSDSDsadsacw18182654891215";
        String key = "jiaoyiyu1231564";
        Map<String, Object> decode = JwtUtil.decode(token, key, salt);
        if (decode == null) {
            return "failed";
        }
        return "success";
    }
}
