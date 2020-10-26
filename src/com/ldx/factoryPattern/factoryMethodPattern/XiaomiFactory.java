package com.ldx.factoryPattern.factoryMethodPattern;

public class XiaomiFactory implements AbstractFactory {
    @Override
    public void makeFactoryPhone() {
        new Xiaomi().makePhone();
    }
}
