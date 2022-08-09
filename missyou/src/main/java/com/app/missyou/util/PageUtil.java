package com.app.missyou.util;

import com.app.missyou.bo.PageCounter;

/**
 * 分页工具类
 */
public class PageUtil {

    /**
     *
     * @param start  0、10、20、30
     * @param count  10
     * @return com.app.missyou.bo.PageCounter
     */
    public static PageCounter convertToPageParameter(Integer start, Integer count) {
        Integer pageNum = start / count;
        PageCounter pageCounter = PageCounter.builder()
                .page(pageNum)
                .count(count)
                .build();
        return pageCounter;
    }

    public static void main(String[] args) {
        PageCounter pageCounter = convertToPageParameter(10, 10);
        System.out.println(pageCounter);
    }
}
