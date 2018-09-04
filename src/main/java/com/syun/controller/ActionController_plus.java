package com.syun.controller;

import com.syun.pojo.TbItemCustom;
import com.syun.service.TbItemCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by it_mck 2018/9/3 10:26
 *
 * @Description:多表操作
 * @Version: 1.0
 */
@Controller
@RequestMapping("/getS")
public class ActionController_plus {

    @Autowired
    private TbItemCustomService tbItemCustomService;


    @RequestMapping("selectCus")
    @ResponseBody
    public Map<String ,Object> selectCustom(Long id){
        Map<String ,Object> map = new HashMap<>();

        try {
            TbItemCustom i = tbItemCustomService.selectCustom(id);
            map.put("i",i);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("flg","false");
        }

        return map;
    }

    @PostMapping("/getAp")
    @ResponseBody
    public Map<String,Object> getCon(HttpRequest request){

        Map<String,Object> map = new HashMap<>();

        HttpHeaders headers = request.getHeaders();
        map.put("headers",headers);

        return map;
    }

}
