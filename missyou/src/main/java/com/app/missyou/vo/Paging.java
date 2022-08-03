package com.app.missyou.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 分页信息
 */
@Getter
@Setter
@NoArgsConstructor
public class Paging<T> {

    /**总条数**/
    private Long total;
    /**每页条数**/
    private Integer count;
    /**页数**/
    private Integer page;
    /**总页数**/
    private Integer totalPage;

    private List<T> items;


    public Paging(Page<T> pageT) {
        this.initPageParameters(pageT);
        this.items = pageT.getContent();
    }

    protected void initPageParameters(Page<T> pageT) {
        this.total = pageT.getTotalElements();
        this.count = pageT.getSize();
        this.page = pageT.getNumber();
        this.totalPage = pageT.getTotalPages();
    }
}
