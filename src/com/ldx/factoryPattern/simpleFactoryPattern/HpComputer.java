package com.ldx.factoryPattern.simpleFactoryPattern;

public class HpComputer extends Computer {
    @Override
    public void start() {
        System.out.println("生产惠普电脑");
    }
}
