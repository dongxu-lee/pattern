package com.ldx.factoryPattern.AbstractFactoryPattern;

/**
 * 设计模式--抽象工厂模式
 * 和工厂方法模式相比，抽象工厂模式可以生产更多产品
 */
public class AbstractFactoryTest {


    public static void main(String[] args) {
        AbstractFactory mifactory = new XiaomiFactory();
        AbstractFactory ipfactory = new IPhoneFactory();
        mifactory.makeFactoryPhone();
        ipfactory.makeFactoryPhone();

        mifactory.makeFactoryPC();
        ipfactory.makeFactoryPC();
    }


}
