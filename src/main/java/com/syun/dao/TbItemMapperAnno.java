package com.syun.dao;

import com.syun.pojo.TbItem;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Create by it_mck 2018/9/4 16:22
 *
 * @Description:注解方式写mapper
 * @Version: 1.0
 */
public interface TbItemMapperAnno {


    /**
     *
     * 查询所有
     * @return
     */
    @Select(value = "Select * from tb_item" )//相当于select标签
    @Results(value = {@Result(column = "sell_point",property = "sellPoint")})//相当于resultMap,这句话可以不写,也能映射.因为我在mybatis-config中开启驼峰命名映射
    List<TbItem> getAllItem();

    /**
     *
     * 根据id进行查询
     * @param id
     * @return
     */
   // @Select(value = "select * from tb_item where id=#{id}")
   // @Results(value = {@Result(column = "sell_point",property = "sellPoint")})
    @SelectProvider(type =DynamicProvider.class,method = "selectByCondition")//方式2
    TbItem getItem(Long id);

    /**
     * 插入
     * @param tbItem
     * @return
     */
    @Insert(value = "insert into tb_item(id,title,sell_point,price,num,barcode,image,cid,status,created,updated) values  (#{id},#{title},#{sellPoint} ,#{price},#{num},#{barcode},#{image},#{cid},#{status},#{created},#{updated})")
    int insertObj(TbItem tbItem);

    /**
     *
     * 更新 这种更新很low 不推荐使用
     * @param tbItem
     * @return
     */
    //@Update(value = "update tb_item set title=#{title} sell_point=#{sellPoint},price=#{price},num=#{num},barcode=#{barcode},image=#{image},cid=#{cid},status=#{status},created=#{created},updated=#{updated}")
    @UpdateProvider(method = "updateById",type = DynamicProvider.class )
    int updateObj(TbItem tbItem);
}
