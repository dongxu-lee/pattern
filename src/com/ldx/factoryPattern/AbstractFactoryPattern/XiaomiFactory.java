package com.ldx.factoryPattern.AbstractFactoryPattern;

public class XiaomiFactory implements AbstractFactory {
    @Override
    public void makeFactoryPhone() {
        new Xiaomi().makePhone();
    }

    @Override
    public void makeFactoryPC() {
        //小米不生产PC
        System.out.println("小米不生产PC");
    }
}
