package com.app.missyou.service;


import com.app.missyou.model.Spu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class SpuService {


    public Page<Spu> getByCategory(Boolean isRoot, Integer start, Integer count) {
        PageRequest of = PageRequest.of(start, count);
        if (isRoot) {

            return null;
        }
        return null;
    }

}
