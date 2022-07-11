package com.app.missyou.core.hack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

/**
 * 自动映射前缀
 */
public class AutoPrefixUrlMapping extends RequestMappingHandlerMapping {

    @Value("${app.api-package}")
    private String apiPackagePath;

    @Override
    protected RequestMappingInfo getMappingForMethod(Method method, Class<?> handlerType) {
        RequestMappingInfo mappingInfo = super.getMappingForMethod(method, handlerType);
        if (mappingInfo != null) {
            String prefix = this.getPrefix(handlerType);
            return RequestMappingInfo.paths(prefix).build()
                    .combine(mappingInfo);
        }
        return mappingInfo;
    }


    private String getPrefix(Class<?> handlerType) {
        String packageName = handlerType.getPackage().getName();
        // 截取替换
        String dotPath = packageName.replaceAll(this.apiPackagePath, "");
        return dotPath.replace(".", "/");
    }
}
