package com.ldx.proxyPattern.dynamicProxyPattern;

/**
 * 设计模式--动态代理
 * 给某个对象提供一个代理，并由代理对象控制对原对象的引用
 */
public class ProxyTest {


    public static void main(String[] args) {
        System.out.println("不使用代理类");
        Person person = new Bob();
        person.doSomething();

        System.out.println("----------------------");

        System.out.println("使用代理类");
        Person proxy = (Person) new JDKDynamicProxy(new Bob()).getTarget();
        proxy.doSomething();
    }
}
