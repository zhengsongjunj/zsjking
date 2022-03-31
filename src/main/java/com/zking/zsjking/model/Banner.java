package com.zking.zsjking.model;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.List;

@Entity
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 16)
    private String name;

    private String description;
    private String img;
    private String title;

    @OneToMany
    @JoinColumn(name="bannerId")
    private List<BannerItem> items;

}
