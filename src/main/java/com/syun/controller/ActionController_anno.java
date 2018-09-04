package com.syun.controller;

import com.syun.pojo.TbItem;
import com.syun.service.TbItemServiceAnno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by it_mck 2018/9/4 16:10
 *
 * @Description: mybatis注解方式
 * @Version: 1.0
 */
@RestController
@RequestMapping("/anno")
public class ActionController_anno {

    @Autowired
    private TbItemServiceAnno tbItemServiceAnno;

    /**
     * 查询所有
     *
     * @return
     */
    @RequestMapping("/getAll")
    public Map<String, Object> getAll() {
        Map<String, Object> map = new HashMap<>();

        try {
            List<TbItem> items = tbItemServiceAnno.getAll();
            map.put("items", items);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("fail", "Failed");
        }
        return map;
    }

    /**
     * 根据id进行查询
     *
     * @return
     */
    @RequestMapping("/getById")
    public Map<String, Object> getById(Long id) {
        Map<String, Object> map = new HashMap<>();

        try {
            TbItem item = tbItemServiceAnno.getById(id);
            map.put("item", item);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("fail", "Failed");
        }
        return map;
    }

    /**
     * 插入
     *
     * @return
     */
    @RequestMapping("/insertObj")
    public Map<String, Object> insertObj(@RequestBody TbItem tbItem) {
        Map<String, Object> map = new HashMap<>();

        try {
            int i = tbItemServiceAnno.insertObj(tbItem);
            map.put("i", i);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("fail", "Failed");
        }
        return map;
    }
    /**
     * 更新
     *
     * @return
     */
    @RequestMapping("/updateObj")
    public Map<String, Object> updateObj(@RequestBody TbItem tbItem) {
        Map<String, Object> map = new HashMap<>();

        try {
            int i = tbItemServiceAnno.updateObj(tbItem);
            map.put("i", i);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("fail", "Failed");
        }
        return map;
    }

}
