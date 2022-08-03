package com.app.missyou.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *  简化版主题VO
 */
@Getter
@Setter
@ToString
public class ThemePureVO {
    private Long id;
    private String title;
    private String description;
    private String name;
    private String entranceImg;
    private String extend;
    private String internalTopImg;
    private String titleImg;
    private String tplName;
    private Boolean online;
}
