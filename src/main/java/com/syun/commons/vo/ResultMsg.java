package com.syun.commons.vo;

/**
 * Create by it_mck 2018/9/5 13:58
 *
 * @Description:
 * @Version: 1.0
 */
public class ResultMsg {

    private String key;
    private Object obj;
    private String msg;

    public String getKey() {
        return key;
    }

    public ResultMsg(String key, Object obj) {
        this.key = key;
        this.obj = obj;
    }

    public ResultMsg(String key, String msg) {
        this.key = key;
        this.msg = msg;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
