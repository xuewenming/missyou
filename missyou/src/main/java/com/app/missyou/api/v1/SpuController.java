package com.app.missyou.api.v1;


import com.app.missyou.model.Spu;
import com.app.missyou.service.SpuService;
import com.app.missyou.vo.PagingDozer;
import com.app.missyou.vo.SpuSimplifyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Positive;

@RestController
@RequestMapping(value = "/spu")
@Validated
public class SpuController {

    @Autowired
    private SpuService spuService;

    @GetMapping(value = "/by/category/{id}")
    public PagingDozer<Spu, SpuSimplifyVo> getByCategoryId(@PathVariable @Positive Long id,
                                                           @RequestParam(name = "is_root", defaultValue = "false") Boolean isRoot,
                                                           @RequestParam(name = "start", defaultValue = "0") Integer start,
                                                           @RequestParam(name = "count", defaultValue = "10") Integer count) {

        return null;
    }

}
