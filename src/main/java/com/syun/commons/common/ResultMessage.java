package com.syun.commons.common;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * 消息返回
 * @author wugy
 *  2016年7月11日下午5:03:22
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultMessage {

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
	/**
	 * 分页
	 */
	private Pagination page;

	public ResultMessage() {
		super();
	}

	public ResultMessage(Integer status, String statusMessage) {
		super();
		this.status = status;
		this.statusMessage = statusMessage;
	}

	public ResultMessage(Integer status, String statusMessage, Object data) {
		super();
		this.status = status;
		this.statusMessage = statusMessage;
		this.data = data;
	}
	public ResultMessage(Integer status, Object data, Pagination page) {
		super();
		this.status = status;
		this.data = data;
		this.page=page;
	}
	public ResultMessage(Integer status, Object data) {
		super();
		this.status = status;
		this.data = data;
	}
	public ResultMessage(Object data) {
		super();
		this.data = data;
	}
	
	public ResultMessage(Integer status) {
		super();
		this.status = status;
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

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

	public Pagination getPage() {
		return page;
	}

	public void setPage(Pagination page) {
		this.page = page;
	}

}
