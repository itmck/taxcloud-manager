package com.syun.commons.vo;

/**
 * Create by it_mck 2018/9/5 13:58
 *
 * @Description:
 * @Version: 1.0
 */
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 前端的同事要求说尽量不要有null，可有为空串“” 或者 0 或者 []， 但尽量不要null。
 * 所以@JsonInclude(Include.NON_NULL) 这个注解放在类头上就可以解决。
 * 实体类与json互转的时候 属性值为null的不参与序列化
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultMsg {

    /**
     * 状态
     */
    private Integer status;

    /**
     * 状态消息
     */
    private String statusMessage;

    /**
     * 返回数据
     */
    private Object data;

    public ResultMsg() {
        super();
    }

    public ResultMsg(Integer status, String statusMessage) {
        this.status = status;
        this.statusMessage = statusMessage;
    }

    public ResultMsg(Integer status, Object data) {
        this.status = status;
        this.data = data;
    }

    public ResultMsg(Integer status, String statusMessage, Object data) {
        this.status = status;
        this.statusMessage = statusMessage;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
