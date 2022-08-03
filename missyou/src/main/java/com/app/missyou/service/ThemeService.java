package com.app.missyou.service;

import com.app.missyou.repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.context.Theme;

import java.util.List;
import java.util.Optional;

/**
 *  主题Service
 */
@Service
public class ThemeService {

    @Autowired
    private ThemeRepository themeRepository;

    public List<Theme> findByNames(List<String> names) {
        List<Theme> themes = themeRepository.findByNames(names);
        return themes;
    }

    public Theme findByName(String name) {
        Optional<Theme> theme = themeRepository.findByName(name);
        return theme.get();
    }

}
