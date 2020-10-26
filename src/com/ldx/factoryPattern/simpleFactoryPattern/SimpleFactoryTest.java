package com.ldx.factoryPattern.simpleFactoryPattern;

/**
 * 设计模式--简单工厂模式
 * 对不同实例的创建做了一层封装，这些实例都有相同父类
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Computer computer = ComputerFactory.createComputer("lenovo");
        computer.start();
    }
}
