package com.app.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class BannerItem extends BaseEntity implements Serializable {

    @Id
    private Long id;
    private String img;
    private String keyword;
    private Short type;
    private String name;
    private Long bannerId;

}
