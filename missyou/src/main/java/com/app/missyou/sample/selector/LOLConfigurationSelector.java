package com.app.missyou.sample.selector;

import com.app.missyou.sample.config.HeroConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 选择器
 */
public class LOLConfigurationSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{HeroConfiguration.class.getName()};
    }
}
