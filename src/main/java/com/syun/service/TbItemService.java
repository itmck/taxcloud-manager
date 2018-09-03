package com.syun.service;

import com.syun.pojo.QueryVo;
import com.syun.pojo.TbItem;

import java.util.List;

/**
 * Create by it_mck 2018/9/2 11:33
 *
 * @Description:
 * @Version: 1.0
 */
public interface TbItemService {
    //获取所有
    List<TbItem> getAll();

    //根据id进行获取
    TbItem getById(Long id);

    //条件查找
    List<TbItem> selectUseCondition(TbItem tbItem);
    //条件查找2
    List<TbItem> selectUseCondition2(TbItem tbItem);

    //更新
    int updateByCon(TbItem tbItem);

    //查找
    List<TbItem> selectByCon_trim(TbItem tbItem);

    //更新trim
    int updateBy_trim(TbItem tbItem);
    //插入
    int insertTbTtem(TbItem tbItem);

    //动态插入
    int insertTbTtem_trim(TbItem tbItem);

    //foreach查询
    List<TbItem> selectByForeach(List<Long> ids);
    //动态删除_foreach
    int deleteByForeach(List<Long> ids);

    //查询通过单独封装
    List<TbItem> selectByMap(QueryVo queryVo);
}
