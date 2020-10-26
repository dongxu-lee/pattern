package com.ldx.factoryPattern.AbstractFactoryPattern;

public class IPhoneFactory implements AbstractFactory {
    @Override
    public void makeFactoryPhone() {
        new IPhone().makePhone();
    }

    @Override
    public void makeFactoryPC() {
        new MAC().makePC();
    }
}
