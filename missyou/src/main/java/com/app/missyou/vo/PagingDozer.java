package com.app.missyou.vo;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.data.domain.Page;


import java.util.ArrayList;
import java.util.List;

/**
 * 分页序列化操作
 */
public class PagingDozer<T,K> extends Paging{

    public PagingDozer(Page<T> pageT,Class<K> classK) {
        this.initPageParameters(pageT);
        List<T> tList = pageT.getContent();
        Mapper mapper = DozerBeanMapperBuilder.buildDefault();
        List<K> voList = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(tList)) {
            tList.forEach(t -> {
                K vo = mapper.map(t, classK);
                voList.add(vo);
            });
        }
        this.setItems(voList);
    }
}
