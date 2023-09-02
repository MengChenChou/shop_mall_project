package com.idv.shop_mall_project.core.util;

import io.swagger.annotations.ApiModelProperty;


import java.io.Serializable;
import java.util.List;

/**
 * @author RickChou
 * @create 2023-09-03 上午 06:43
 */

public class PageResult<T> implements Serializable {

    @ApiModelProperty("總記錄數")
    private int totalCount;

    @ApiModelProperty("每頁記錄數")
    private int pageSize;

    @ApiModelProperty("總頁數")
    private int totalPage;

    @ApiModelProperty("當前頁數")
    private int currPage;

    @ApiModelProperty("列表數據")
    private List<T> list;

    /**
     * 分页
     *
     * @param list       列表數據
     * @param totalCount 總記錄數
     * @param pageSize   每頁記錄數
     * @param currPage   當前頁數
     */
    public PageResult(List<T> list, int totalCount, int pageSize, int currPage) {
        this.list = list;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.currPage = currPage;
        this.totalPage = (int) Math.ceil((double) totalCount / pageSize);
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

}
