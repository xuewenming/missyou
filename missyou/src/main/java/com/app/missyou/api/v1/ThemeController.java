package com.app.missyou.api.v1;

import com.app.missyou.exception.http.NotFoundException;
import com.app.missyou.service.ThemeService;
import com.app.missyou.vo.ThemePureVO;
import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.context.Theme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 主题
 */
@RestController
@RequestMapping(value = "/theme")
public class ThemeController {


    @Autowired
    private ThemeService themeService;

    @GetMapping(value = "/by/names")
    public List<ThemePureVO> getThemeGroupByNames(@RequestParam(name = "names") String names) {
        List<String> nameList = Arrays.asList(names.split(","));
        List<Theme> themes = themeService.findByNames(nameList);
        List<ThemePureVO> themeList = themes.stream().map(theme -> {
            ThemePureVO pureVo = new ThemePureVO();
            Mapper mapper = DozerBeanMapperBuilder.buildDefault();
            mapper.map(theme, pureVo);
            return pureVo;
        }).collect(Collectors.toList());
        return themeList;
    }

    @GetMapping("/name/{name}/with_spu")
    public Theme getThemeByName(@RequestParam(name = "name") String themeName) {
        Theme theme = themeService.findByName(themeName);
        if (theme == null) {
            throw new NotFoundException(30003);
        }
        return theme;
    }
}
