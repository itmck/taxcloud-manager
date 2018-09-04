package com.syun.dao;

import com.syun.pojo.TbItem;
import org.apache.ibatis.jdbc.SQL;

/**
 * Create by it_mck 2018/9/4 19:21
 *
 * @Description:注解方式的动态sql
 * @Version: 1.0
 */
public class DynamicProvider {


    /**
     * 注解方式动态sql之更新操作
     * @param tbItem
     * @return
     */
    public String updateById(TbItem tbItem) {

        SQL sql = new SQL();
        sql.UPDATE("tb_item");

        if(tbItem.getTitle()!=null){
                sql.SET("title=#{title}");
        }

        if(tbItem.getSellPoint()!=null){
            sql.SET("sell_point=#{sellPoint}");
        }
        //更新时,这个id省略的话会更新全部
        if(tbItem.getId()!=null){
            sql.WHERE("id=#{id}");
        }
        return sql.toString();
    }

    /**
     * 根据id查找  根据其他属性进行查找同理,在传参时使用 PojoVo封装条件即可
     * @return 返回值必须是String类型
     */
    public String selectByCondition(Long id){

        SQL sql = new SQL();

        sql.SELECT("title","sell_point").FROM("tb_item");

        if(id!=null){
            sql.WHERE("id=#{id}");
        }
        return sql.toString();
    }
}
