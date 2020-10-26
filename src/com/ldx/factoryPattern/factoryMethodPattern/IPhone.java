package com.ldx.factoryPattern.factoryMethodPattern;

public class IPhone implements Phone {
    @Override
    public void makePhone() {
        System.out.println("制造苹果手机");
    }
}
