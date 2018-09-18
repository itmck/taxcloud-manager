package com.syun.controller.Login;

import com.syun.commons.weather.Weather;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by it_mck 2018/9/14 23:38
 *
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("/get")
public class LoginController {

    /**
     * 登录获取数据测试
     *
     * @param uname
     * @param pwd
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public Map<String, Object> login(String uname, String pwd, String sex, String city) {
        Map<String, Object> map = new HashMap<>();
        map.put("用户名", uname);
        map.put("密码", pwd);
        map.put("性别", sex);
        map.put("城市", city);
        return map;
    }

    /**
     * 进入login页面
     */
    @RequestMapping("/loginIndex")
    public String loginIndex() {

        return "/index";
    }

    /**
     * 返回城市天气信息
     *
     * @param address
     * @return
     */
    @RequestMapping("/getWeather")
    @ResponseBody
    public String getWeather(String address) {

        return Weather.getWeather(address);
    }
}
