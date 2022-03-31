package com.zking.zsjking.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class BannerItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String img;
    private String keyword;
    private Short type;
    private String name;

    private Long bannerId;
}
