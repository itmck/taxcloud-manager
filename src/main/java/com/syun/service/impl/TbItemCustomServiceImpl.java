package com.syun.service.impl;

import com.syun.dao.TbItemCustomMapper;
import com.syun.pojo.TbItemCustom;
import com.syun.service.TbItemCustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by it_mck 2018/9/3 10:32
 *
 * @Description:
 * @Version: 1.0
 */
@Service
public class TbItemCustomServiceImpl implements TbItemCustomService {

    @Autowired
    private TbItemCustomMapper tbItemCustomMapper;

    @Override
    public TbItemCustom selectCustom(Long id) {
        return tbItemCustomMapper.selectByCustomById(id);
    }
}
