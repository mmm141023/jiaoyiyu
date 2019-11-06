package com.jiaoyiyu.passport.cotroller;

import com.jiaoyiyu.bean.User;
import com.jiaoyiyu.service.UserService;
import com.jiaoyiyu.util.JwtUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/passport")
@Controller
public class PassPortController {

    @Reference
    UserService userService;
    /**
     * 登录首页
     * @param request
     * @param modelMap
     * @return
     */
    @RequestMapping("/index")
    public String index(HttpServletRequest request, ModelMap modelMap) {
        String returnUrl = request.getParameter("returnUrl");
        if (StringUtils.isBlank(returnUrl)) {
            returnUrl = "http://localhost:8082/index";
        }
        modelMap.put("returnUrl", returnUrl);
        return "index";
    }




    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {

        String salt = "dsfasdfsDAFsadsadDSDDCVeawSDSDsadsacw18182654891215";
        String key = "jiaoyiyu1231564";
        String token = "";
        User user = userService.checkUser(username,password);
        if (user == null) {
            return "failed";
        }else {
            token = makeToken(salt,key,user);
        }
        return token;
    }

    private String makeToken(String salt, String key, User user) {
        Map<String,Object> param = new HashMap<>();
        param.put("memberId", user.getId());
        param.put("nickname", user.getNickName());
        String token = JwtUtil.encode(key, param, salt);
        return token;
    }
}
