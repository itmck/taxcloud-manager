package com.syun.service.impl;

import com.syun.dao.TbItemMapperAnno;
import com.syun.pojo.TbItem;
import com.syun.service.TbItemServiceAnno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by it_mck 2018/9/4 16:17
 *
 * @Description:
 * @Version: 1.0
 */
@Service
public class TbItemServiceAnnoImpl implements TbItemServiceAnno {

    @Autowired
    private TbItemMapperAnno tbItemMapperAnno;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<TbItem> getAll() {
        return tbItemMapperAnno.getAllItem();
    }

    /**
     * 根据id进行查询
     * @return
     */
    @Override
    public TbItem getById(Long id) {

        return tbItemMapperAnno.getItem(id);
    }

    /**
     *
     * 插入
     * @param tbItem
     * @return
     */

    @Override
    public int insertObj(TbItem tbItem) {
        return tbItemMapperAnno.insertObj(tbItem);
    }

    /**
     * 更新
     * @param tbItem
     * @return
     */
    @Override
    public int updateObj(TbItem tbItem) {
        return tbItemMapperAnno.updateObj(tbItem);
    }
}
