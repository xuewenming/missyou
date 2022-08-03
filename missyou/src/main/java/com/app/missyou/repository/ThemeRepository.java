package com.app.missyou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.ui.context.Theme;

import java.util.List;
import java.util.Optional;


public interface ThemeRepository extends JpaRepository<Theme,Long> {

    @Query("select t from Theme t where t.name in (:names)")
    List<Theme> findByNames(List<String> names);


    Optional<Theme> findByName(String name);
}