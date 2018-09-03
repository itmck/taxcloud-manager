package com.syun.pojo;

/**
 * Create by it_mck 2018/9/3 9:39
 *
 * @Description:封装查询条件,一般条件查询建议使用封装类
 * @Version: 1.0
 */
public class QueryVo {

    private String title;

    private String sellPoint;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }
}
