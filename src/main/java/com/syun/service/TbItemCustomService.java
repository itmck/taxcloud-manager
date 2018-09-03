package com.syun.service;

import com.syun.pojo.TbItemCustom;

/**
 * Create by it_mck 2018/9/3 10:29
 *
 * @Description:
 * @Version: 1.0
 */
public interface TbItemCustomService {
    //多表查询
    TbItemCustom selectCustom(Long id);
}
