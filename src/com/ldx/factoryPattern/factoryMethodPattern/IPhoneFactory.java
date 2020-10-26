package com.ldx.factoryPattern.factoryMethodPattern;

public class IPhoneFactory implements AbstractFactory {
    @Override
    public void makeFactoryPhone() {
        new IPhone().makePhone();
    }
}
