package com.syun.controller.json;

import com.syun.commons.mytest.json.ItemPic;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by it_mck 2018/10/15 15:55
 *
 * @Description:
 * @Version: 1.0
 */
@Controller
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/j")
    @ResponseBody
    public Map<String,Object> getJson(@RequestBody ItemPic itemPic){

        System.out.println("==============================>");
        Map<String,Object> map = new HashMap<>();
        map.put("describ",itemPic.getDescrib());
        map.put("srcs",itemPic.getSrcs());
        return map;

    }

}
