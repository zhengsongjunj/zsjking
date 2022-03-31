package com.zking.zsjking.repository;

import com.zking.zsjking.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

// 两个类型,操作实体+实体主键
public interface BannerRepository extends JpaRepository<Banner,Long> {
    Banner findOneById(Long id);
    Banner findOneByName(String name);
}
