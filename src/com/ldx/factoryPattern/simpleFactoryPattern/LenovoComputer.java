package com.ldx.factoryPattern.simpleFactoryPattern;

public class LenovoComputer extends Computer {
    @Override
    public void start() {
        System.out.println("生产联想电脑");
    }
}
