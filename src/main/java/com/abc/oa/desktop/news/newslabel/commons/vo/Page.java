package com.abc.oa.desktop.news.newslabel.commons.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author admin
 * @date 2020/12/28 1:59
 * version 1.0
 */

//page是VO对象，value Object对象 ，完成java类与jsp页面的数据传递
public class Page<T> {   //加泛型原因：为了保证page对象的通融性，即提高通用性
    private int pageno;   //当前页面的页码
    private int pageStartIndex;//当前页面记录的索引
    private int pageSize; //页码大小 （每页可以显示的记录数）
    private int totalRows;//总记录数
    private int totalPages;//总页码
    private List<T> datas;//当前页包含的具体数据

    public  Page(){
        this.pageno=1;
        this.pageSize=3;
        datas = new ArrayList<>();

    }

    public int getPageno() {
        return pageno;
    }

    public void setPageno(int pageno) {
        this.pageno = pageno;
    }

    public int getPageStartIndex() { //定义每一页索引的开始
        //第一页起始索引为0，定义每页显示的数据为pageSize行，则下一页的索引开始为(pageno-1)*pageSize
        return (pageno-1)*pageSize;
    }

    public void setPageStartIndex(int pageStartIndex) {
        this.pageStartIndex = pageStartIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalPages() {  //总页码数
        if(totalRows % pageSize == 0){
            totalPages = totalRows/pageSize;
        }else {
            totalPages = totalRows/pageSize+1; //当前页码不能是整页时，多加一页显示
        }
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageno=" + pageno +
                ", pageStartIndex=" + pageStartIndex +
                ", pageSize=" + pageSize +
                ", totalRows=" + totalRows +
                ", totalPages=" + totalPages +
                ", datas=" + datas +
                '}';
    }
}
