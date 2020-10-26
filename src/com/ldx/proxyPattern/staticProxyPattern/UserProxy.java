package com.ldx.proxyPattern.staticProxyPattern;

public class UserProxy {

    private User user;

    public UserProxy(User user) {
        this.user = user;
    }

    public void addProxy() {
        System.out.println("add方法前置增强");
        user.add();
        System.out.println("add方法后置增强");
    }


}
