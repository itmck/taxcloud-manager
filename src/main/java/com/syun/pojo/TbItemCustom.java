package com.syun.pojo;

/**
 * Create by it_mck 2018/9/3 10:31
 *
 * @Description:因为使用多表连接查询,此时只要继承对应的类,父类中不存在字段写在子类中
 * @Version: 1.0
 */
public class TbItemCustom extends TbItem {

    /**
     *
     * 商品种类名称
     */
    private String catName;
    /**
     *
     * 商品状态
     */
    private String  statusName;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
