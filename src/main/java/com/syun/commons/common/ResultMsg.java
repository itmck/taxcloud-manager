package com.syun.commons.common;

public class ResultMsg {
	private Integer code=0;
	
	private String msg="";
	
	private Object data;
	
	private Integer count;

	public ResultMsg(Integer code, String msg, Object data, Integer count) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
		this.count = count;
	}
	
	

	public ResultMsg(Integer code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public ResultMsg(Object data, Integer count) {
		this.data = data;
		this.count = count;
	}
     
	
	public ResultMsg(Object data) {
		super();
		this.data = data;
	}



	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	
	
	
}
