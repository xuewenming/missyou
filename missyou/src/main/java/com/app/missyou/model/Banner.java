package com.app.missyou.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;

/**
 * 横幅
 */
@Entity
@Table(name = "banner")
public class Banner implements Serializable {

    @Id
    private Long id;
    @Column(length = 32)
    private String name;
    // 忽略实体映射
    @Transient
    private String description;
    /**
     * 图片地址
     **/
    private String img;
    private String title;

}
