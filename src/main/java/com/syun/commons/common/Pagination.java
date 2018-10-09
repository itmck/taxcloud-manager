package com.syun.commons.common;

/**
 * 分页类
 * @author wugy
 *  2016年7月11日下午5:02:32
 *
 */
public class Pagination {

    public static final int DEF_COUNT = 10;
    protected int totalCount;
    protected int pageSize;
    protected int pageNo;
    protected int totalPage=0;
    public Pagination()
    {
        totalCount = 0;
        pageSize = 10;
        pageNo = 1;
    }

    public Pagination(int pageNo, int pageSize, int totalCount)
    {
        this.totalCount = 0;
        this.pageSize = 10;
        this.pageNo = 1;
        if(totalCount <= 0)
            this.totalCount = 0;
        else
            this.totalCount = totalCount;
        if(pageSize <= 0)
            this.pageSize = 10;
        else
            this.pageSize = pageSize;
        if(pageNo <= 0)
            this.pageNo = 1;
        else
            this.pageNo = pageNo;
//        if((this.pageNo - 1) * this.pageSize >= totalCount)
//            this.pageNo = totalCount / pageSize;
    }

    public Pagination(int pageSize)
    {
        this(1, pageSize, 0);
    }

    public void adjustPage()
    {
        if(totalCount <= 0)
            totalCount = 0;
        if(pageSize <= 0)
            pageSize = 10;
        if(pageNo <= 0)
            pageNo = 1;
        if((pageNo - 1) * pageSize >= totalCount)
            pageNo = totalCount / pageSize;
    }

    public int getPageNo()
    {
        return pageNo;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public int getTotalCount()
    {
        return totalCount;
    }

    public int getTotalPage()
    {
        int totalPage = totalCount / pageSize;
        if(totalCount % pageSize != 0 || totalPage == 0)
            totalPage++;
        return totalPage;
    }

//    public boolean isFirstPage()
//    {
//        return pageNo <= 1;
//    }
//
//    public boolean isLastPage()
//    {
//        return pageNo >= getTotalPage();
//    }
//
//    public int getNextPage()
//    {
//        if(isLastPage())
//            return pageNo;
//        else
//            return pageNo + 1;
//    }
//
//    public int getPrePage()
//    {
//        if(isFirstPage())
//            return pageNo;
//        else
//            return pageNo - 1;
//    }

    public void setTotalCount(int totalCount)
    {
        this.totalCount = totalCount;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    public void setPageNo(int pageNo)
    {
        this.pageNo = pageNo;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
