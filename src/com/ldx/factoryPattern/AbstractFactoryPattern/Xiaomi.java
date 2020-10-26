package com.ldx.factoryPattern.AbstractFactoryPattern;

public class Xiaomi implements Phone {
    @Override
    public void makePhone() {
        System.out.println("制造小米手机");
    }
}
