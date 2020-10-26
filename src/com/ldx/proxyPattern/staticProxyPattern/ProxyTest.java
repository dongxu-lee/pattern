package com.ldx.proxyPattern.staticProxyPattern;

public class ProxyTest {

    public static void main(String[] args) {
        User user = new User();
        UserProxy userProxy = new UserProxy(user);
        userProxy.addProxy();
    }
}
