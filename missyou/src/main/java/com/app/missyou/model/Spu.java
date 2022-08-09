package com.app.missyou.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Spu extends BaseEntity{

    private Long id;
    private String title;
    private String subTitle;
    private Long categoryId;
    private Long rootCategoryId;
    private Integer online;
    private String price;
    private Integer sketchSpecId;
    private Long defaultSkuId;
    private String img;
    private String discountPrice;
    private String description;
    private String tags;
    private Integer isTest;
    private Object spuThemeImg;
    private String forThemeImg;
}
