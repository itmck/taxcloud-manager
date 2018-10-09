package com.syun.controller;

import com.syun.commons.common.BaseController;
import com.syun.commons.vo.ResultMsg;
import com.syun.pojo.QueryVo;
import com.syun.pojo.TbItem;
import com.syun.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by it_mck 2018/9/2 11:31
 *
 * @Description:单表问题操作
 * @Version: 1.0
 */
@Controller
@RequestMapping("/tb")
public class ActionController extends BaseController {

    @Autowired
    private TbItemService tbItemService;

    /**
     *
     * 获取所有的数据
     * @return
     */
    @RequestMapping("/getAll")
    @ResponseBody
    public Map<String, Object> getAll() {
        Map<String, Object> map = new HashMap<>();

        List<TbItem> list = null;
        try {
            list = tbItemService.getAll();
            map.put("list", list);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("list", "出现错误");
        }

        return map;
    }
    /**
     *
     * 根据id获取
     * @return
     */
    @RequestMapping("/getById")
    @ResponseBody
    public Map<String, Object> getById(@RequestParam(value ="id",defaultValue ="0") Long id) {
        Map<String, Object> map = new HashMap<>();

        try {
            TbItem list = tbItemService.getById(id);
            map.put("list", list);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("list", "出现错误");
        }

        return map;
    }
    /**
     *
     * 条件查找
     * @return
     */
    @RequestMapping("/getByCon")
    @ResponseBody
    public Map<String, Object> selectUseCondition(@RequestBody TbItem tbItem) {
        Map<String, Object> map = new HashMap<>();

        try {
            List<TbItem> list = tbItemService.selectUseCondition(tbItem);
            map.put("list", list);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("list", "出现错误");
        }

        return map;
    }
    /**
     *
     * 条件查找
     * @return
     */
    @RequestMapping("/getByCon2")
    @ResponseBody
    public Map<String, Object> selectUseCondition2(@RequestBody TbItem tbItem) {
        Map<String, Object> map = new HashMap<>();

        try {
            List<TbItem> list = tbItemService.selectUseCondition2(tbItem);
            map.put("list", list);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("list", "出现错误");
        }

        return map;
    }
    /**
     *
     * 更新
     * @return
     */
    @RequestMapping("/updateByCon2")
    @ResponseBody
    public Map<String, Object> updateByCon(@RequestBody TbItem tbItem) {
        Map<String, Object> map = new HashMap<>();

        try {
            int i = tbItemService.updateByCon(tbItem);
            map.put("i", i);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("i", "出现错误");
        }

        return map;
    }
    /**
     *
     * trim方式查找
     * @return
     */
    @RequestMapping("/selectByt")
    @ResponseBody
    public Map<String, Object> selectByCon_trim(@RequestBody TbItem tbItem) {
        Map<String, Object> map = new HashMap<>();

        try {
            List<TbItem> i = tbItemService.selectByCon_trim(tbItem);
            map.put("i", i);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("i", "出现错误");
        }

        return map;
    }
    /**
     *
     * trim方式更新
     * @return
     */
    @RequestMapping("/updateByt")
    @ResponseBody
    public Map<String, Object> updateBy_trim(@RequestBody TbItem tbItem) {
        Map<String, Object> map = new HashMap<>();

        try {
            int i = tbItemService.updateBy_trim(tbItem);
            map.put("i", i);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("i", "出现错误");
        }

        return map;
    }
    /**
     *
     * 动态sql插入
     * @return
     */
    @RequestMapping("/insertTbTtem")
    @ResponseBody
    public Map<String, Object> insertTbTtem_trim(@RequestBody TbItem tbItem) {
        Map<String, Object> map = new HashMap<>();

        try {
            int i = tbItemService.insertTbTtem_trim(tbItem);
            map.put("i", i);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("i", "出现错误");
        }

        return map;
    }
    /**
     *
     * 普通sql插入
     * @return
     */
    @RequestMapping("/insertTbTtem2")
    @ResponseBody
    public Map<String, Object> insertTbTtem(@RequestBody TbItem tbItem) {
        Map<String, Object> map = new HashMap<>();

        try {
            int i = tbItemService.insertTbTtem(tbItem);
            map.put("i", i);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("i", "出现错误");
        }

        return map;
    }
    /**
     *
     * 普通sql插入
     * @return
     */
    @RequestMapping("/selectByF")
    @ResponseBody
    public Map<String, Object> selectByForeach(@RequestParam("ids") List<Long> ids) {
        Map<String, Object> map = new HashMap<>();
        try {
            List<TbItem> i = tbItemService.selectByForeach(ids);
            map.put("i", i);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("i", "出现错误");
        }

        return map;
    }
    /**
     *
     * 动态删除
     * @return
     */
    @RequestMapping("/deleteByF")
    @ResponseBody
    public Map<String, Object> deleteByForeach(@RequestParam("ids") List<Long> ids) {
        Map<String, Object> map = new HashMap<>();
        try {
            int i = tbItemService.deleteByForeach(ids);
            map.put("i", i);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("i", "出现错误");
        }

        return map;
    }
    /**
     *
     * 查询使用map封装
     * @return
     */
    @RequestMapping("/selectByM")
    @ResponseBody
    public Map<String, Object> selectByMap(@RequestBody  QueryVo queryVo) {
        Map<String, Object> map = new HashMap<>();
        try {
            List<TbItem> i = tbItemService.selectByMap(queryVo);
            map.put("i", i);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("i", "出现错误");
        }

        return map;
    }
    /**
     *
     * 查询使用map封装 fangshi2
     * @return
     */
    @RequestMapping("/selectByM2")
    @ResponseBody
    public ResultMsg selectByMap2(@RequestBody  QueryVo queryVo) {
        try {
            List<TbItem> i = tbItemService.selectByMap(queryVo);
            return new ResultMsg(SUCCESS,i);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultMsg(FAIL,"失败");
        }

    }
}
