package com.ywz.utils;



import com.ywz.pojo.Book;

import java.util.Arrays;
import java.util.List;

public class PageUtil {
    private int totalCount;//一共有多少条数据
    private int size;//每页展示几条数据
    private int totalPageCount;//一共有多少页
    private int page;//当前页码
    private int[] pageNums;//展示当前页数的数组
    List<Book> bookList;

    public PageUtil(int totalCount, int size, int totalPageCount, int page, int[] pageNums, List<Book> bookList) {
        this.totalCount = totalCount;
        this.size = size;
        this.totalPageCount = totalPageCount;
        this.page = page;
        this.pageNums = pageNums;
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "PageUtil{" +
                "totalCount=" + totalCount +
                ", size=" + size +
                ", totalPageCount=" + totalPageCount +
                ", page=" + page +
                ", pageNums=" + Arrays.toString(pageNums) +
                '}';
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public PageUtil(int totalCount, int size, int totalPageCount, int page, int[] pageNums) {
        this.totalCount = totalCount;
        this.size = size;
        this.totalPageCount = totalPageCount;
        this.page = page;
        this.pageNums = pageNums;
    }

    public PageUtil() {
    }



    //获取startIndex的方法：
    public int getStartIndex(){ return size * (page - 1); }
    //得到所有数据
    //从数据库中查出一共有多少条记录，通过参数totalCount设置进来
    public void setTotalCount(int totalCount) { this.totalCount = totalCount; }
    public int[] getPageNums() {
        return pageNums;
    }

    public void setPageNums() {
        //初始化数组        数组长度
        pageNums = new int[totalPageCount>3?3:totalPageCount];
        //定义一个开始
        int begin = 1;
        //定义一个结束
        int end = 3;
        //定义数组初始下标
        int k = 0;
        //页数<3
        if (totalPageCount <= 3){
            end = totalPageCount;
        }else if (totalPageCount >3) {//页数>3
            //例如当前页为3，则前面为3-1=2
            begin = page - 1;
            //后面为3+1=4
            end = page + 1;
            if (begin <= 0){//当page为第一页的时候，begin会变为0
                begin = 1;//设置第一页不为0
                end = 3;
            }
            if(end > totalPageCount){ //当page为最后一页的时候，end会比最后一页还大
                end = totalPageCount; //设置最后一页为最大页数
                begin = end - 2; //数组中有三个数据，所以第一个为end-2
            }
        }
            for (int i = begin; i <= end; i++) {
                //设置页码
                pageNums[k] = i;
                k++;
            }
        }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    //页数
    public int getTotalPageCount() {
        if (totalCount % size == 0) {
            this.totalPageCount = this.totalCount / this.size;
        }else {
            this.totalPageCount = this.totalCount / this.size + 1;
        }
        return totalPageCount;
    }
}
