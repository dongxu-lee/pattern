package com.ldx.proxyPattern.staticProxyPattern;

public class User implements Feature {
    @Override
    public void add() {
        System.out.println("user执行add逻辑");
    }
}
