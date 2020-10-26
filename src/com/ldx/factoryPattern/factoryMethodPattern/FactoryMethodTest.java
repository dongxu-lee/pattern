package com.ldx.factoryPattern.factoryMethodPattern;

/**
 * 设计模式--工厂方法模式
 * 和简单工厂模式中工厂负责生产所有产品相比，工厂方法模式将生成具体产品的任务分发给具体的产品工厂
 */
public class FactoryMethodTest {


    public static void main(String[] args) {
        AbstractFactory mifactory = new XiaomiFactory();
        AbstractFactory ipfactory = new IPhoneFactory();
        mifactory.makeFactoryPhone();
        ipfactory.makeFactoryPhone();
    }


}
