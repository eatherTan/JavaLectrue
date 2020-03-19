package com.example.designpattern.proxy;

public class Client {
    public static void main(String[] args) {
        ProxySubject proxy = new ProxySubject();
        proxy.request();
    }
}
