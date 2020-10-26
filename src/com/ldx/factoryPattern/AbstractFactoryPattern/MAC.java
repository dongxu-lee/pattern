package com.ldx.factoryPattern.AbstractFactoryPattern;

public class MAC implements PC {
    @Override
    public void makePC() {
        System.out.println("生产mac电脑");
    }
}
