package com.syun.controller.Login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Create by it_mck 2018/10/8 22:02
 *
 * @Description: 向页面传值的三种方式
 * @Version: 1.0
 */
@Controller
@RequestMapping("bd")
public class MapController {

    @RequestMapping("dt")
    public String mapIndex(Map<String, Object> map){
        map.put("j",117.282);
        map.put("w",31.866);
        map.put("city","合肥");
        return "dt";
    }
    @RequestMapping("dt2")
    public String mapIndex2(Model model){
        model.addAttribute("j",117.282);
        model.addAttribute("w",31.866);
        return "dt";
    }

    @RequestMapping("/dt3")
    public ModelAndView getData(){
        //创建对象
        ModelAndView mav = new ModelAndView();
        //设置视图
        mav.setViewName("dt");//走视图解析器,其实这个dt 就是要访问的jsp页面
        //设置数据
        mav.addObject("j",117.282);
        mav.addObject("w",31.866);
        return mav;
    }


}
