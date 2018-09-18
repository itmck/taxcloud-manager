package com.syun.dao;

import com.syun.pojo.TbItem;

import java.util.List;
import java.util.Map;

/**
 * Create by it_mck 2018/9/2 11:39
 *
 * @Description:
 * @Version: 1.0
 */
public interface TbItemMapper {
    //获取所有
    List<TbItem> selectAll();
    //根据id进行查找
    TbItem selectById(Long id);

    //条件查找
    List<TbItem> selectUseCondition(TbItem tbItem);
    //条件查找2
    List<TbItem> selectUseCondition2(TbItem tbItem);
    //更新
    int updateByCon(TbItem tbItem);
    //trim方式查找
    List<TbItem> selectByCon_trim(TbItem tbItem);
    //trim方式更新
    int updateBy_trim(TbItem tbItem);
    //动态sql插入
    int insertTbTtem_trim(TbItem tbItem);
    //动态sql插入
    int insertTbTtem(TbItem tbItem);
    List<TbItem> selectByForeach(List<Long> ids);
    //动态删除
    int deleteByForeach(List<Long> ids);
    //使用传入map去查询,适用于 多个参数的问题,这样不用写 @param
    List<TbItem> queryByMap(Map<String,Object> map);

    //使用传入map去查询,适用于 多个参数的问题,这样不用写 @param
    List<TbItem> queryByMap2(Map<String,Object> map);
}
