package com.syun.service;

import com.syun.pojo.TbItem;

import java.util.List;

/**
 * Create by it_mck 2018/9/4 16:14
 *
 * @Description:
 * @Version: 1.0
 */
public interface TbItemServiceAnno {
    //获取所有
    List<TbItem> getAll();

    //根据id进行查询
    TbItem getById(Long id);

    //插入
    int insertObj(TbItem tbItem);

    //更新
    int updateObj(TbItem tbItem);
}
