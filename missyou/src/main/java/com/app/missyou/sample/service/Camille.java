package com.app.missyou.sample.service;

import org.springframework.stereotype.Component;

/**
 * LOL 卡密尔
 */
//@Component
public class Camille implements ISkill{
    @Override
    public void q() {
        System.out.println("Camille q");
    }

    @Override
    public void w() {
        System.out.println("Camille w");
    }

    @Override
    public void e() {
        System.out.println("Camille e");
    }

    @Override
    public void r() {
        System.out.println("Camille r");
    }
}
