package com.app.missyou.api.v1;

import com.app.missyou.exception.http.NotFoundException;
import com.app.missyou.model.Banner;
import com.app.missyou.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

/**
 * Banner控制器
 *
 * @date 2022年06月26日 22:04
 */
@RestController
@RequestMapping(value = "/banner")
@Validated
public class BannerController {

    @Autowired
    private BannerService bannerService;

    /**
     * 根据Name获取Banner
     * @param name
     * @return java.lang.Object
     */
    @GetMapping("/name/{name}")
    public Object getByName(@PathVariable @NotBlank String name) {
        Banner banner = bannerService.getByName(name);
        if (banner == null) {
            throw new NotFoundException(30005);
        }
        return banner;
    }
}
