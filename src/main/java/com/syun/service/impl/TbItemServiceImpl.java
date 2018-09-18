package com.syun.service.impl;

import com.syun.dao.TbItemMapper;
import com.syun.pojo.QueryVo;
import com.syun.pojo.TbItem;
import com.syun.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by it_mck 2018/9/2 11:36
 *
 * @Description:
 * @Version: 1.0
 */
@Service
public class TbItemServiceImpl implements TbItemService {

    @Autowired
    private TbItemMapper tbItemMapper;

    /**
     * 获取所有
     *
     * @return
     */
    @Override
    public List<TbItem> getAll() {
        return tbItemMapper.selectAll();
    }

    /**
     * 根据id进行获取
     *
     * @param id
     * @return
     */
    @Override
    public TbItem getById(Long id) {
        return tbItemMapper.selectById(id);
    }

    /**
     * 条件查找
     *
     * @param tbItem
     * @return
     */
    @Override
    public List<TbItem> selectUseCondition(TbItem tbItem) {
        return tbItemMapper.selectUseCondition(tbItem);
    }

    /**
     * 条件查找2
     *
     * @param tbItem
     * @return
     */
    @Override
    public List<TbItem> selectUseCondition2(TbItem tbItem) {
        return tbItemMapper.selectUseCondition2(tbItem);
    }

    /**
     * 更新
     *
     * @param tbItem
     * @return
     */
    @Override
    public int updateByCon(TbItem tbItem) {
        return tbItemMapper.updateByCon(tbItem);
    }

    /**
     * 查找_trim
     *
     * @param tbItem
     * @return
     */
    @Override
    public List<TbItem> selectByCon_trim(TbItem tbItem) {
        return tbItemMapper.selectByCon_trim(tbItem);
    }

    /**
     * 更新_trim
     *
     * @param tbItem
     * @return
     */
    @Override
    public int updateBy_trim(TbItem tbItem) {
        return tbItemMapper.updateBy_trim(tbItem);
    }

    /**
     * 动态sql插入
     *
     * @param tbItem
     * @return
     */
    @Override
    public int insertTbTtem_trim(TbItem tbItem) {
        return tbItemMapper.insertTbTtem_trim(tbItem);
    }

    /**
     * 普通sql插入
     *
     * @param tbItem
     * @return
     */
    @Override
    public int insertTbTtem(TbItem tbItem) {
        return tbItemMapper.insertTbTtem(tbItem);
    }

    /**
     * foreach查询
     *
     * @param ids
     * @return
     */
    @Override
    public List<TbItem> selectByForeach(List<Long> ids) {
        return tbItemMapper.selectByForeach(ids);
    }

    /**
     * 动态删除之foreach
     *
     * @param ids
     * @return
     */
    @Override
    public int deleteByForeach(List<Long> ids) {
        return tbItemMapper.deleteByForeach(ids);
    }

    /**
     * 查询
     *
     * @param queryVo
     * @return
     */
    @Override
    public List<TbItem> selectByMap(QueryVo queryVo) {

        Map<String, Object> map = new HashMap<>();
        map.put("sellPoint",queryVo.getSellPoint());
        map.put("title",queryVo.getTitle());
        return tbItemMapper.queryByMap2(map);
//        map.put("queryVo", queryVo);
//        return tbItemMapper.queryByMap(map);
    }
}
