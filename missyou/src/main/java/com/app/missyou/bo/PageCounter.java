package com.app.missyou.bo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class PageCounter {

    private Integer page;
    private Integer count;

}
