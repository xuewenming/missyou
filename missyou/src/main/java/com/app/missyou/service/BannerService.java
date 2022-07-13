package com.app.missyou.service;

import com.app.missyou.model1.Banner;
import com.app.missyou.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Banner Service
 */
@Service
public class BannerService {

    @Autowired
    private BannerRepository bannerRepository;

    public Banner getByName(String name) {
        Banner banner = bannerRepository.findOneByName(name);
        return banner;
    }

}
