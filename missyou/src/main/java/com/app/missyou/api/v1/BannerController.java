package com.app.missyou.api.v1;

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
@RequestMapping(value = "/v1/banner")
public class BannerController {

    /**
     * 根据Name获取Banner
     * @param name
     * @return java.lang.Object
     */
    @GetMapping("/name/{name}")
    public Object getByName(@PathVariable @NotBlank String name) {

        return null;
    }
}
