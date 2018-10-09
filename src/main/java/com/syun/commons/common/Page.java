package com.syun.commons.common;

public class Page {
	public static final int DEF_COUNT = 10;
	protected int count;
	protected int limit=10;
	protected int page=1;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

}
