package com.app.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

/**
 *
 */
@Entity
@Getter
@Setter
public class Banner extends BaseEntity implements Serializable {

    @Id
    private Long id;
    /**
     * 名称-内部使用
     */
    private String name;
    private String description;
    /**
     * 标题-外部展示
     */
    private String title;
    private String img;

    /**
     * 设置单向绑定
     * 设置关联外键名称
     */
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "bannerId")
    private List<BannerItem> items;
}
