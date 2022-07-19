package com.app.missyou.repository;

import com.app.missyou.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 */
//@Repository
public interface BannerRepository extends JpaRepository<Banner,Long> {


    Banner findOneById(Long id);

    Banner findOneByName(String name);

}
