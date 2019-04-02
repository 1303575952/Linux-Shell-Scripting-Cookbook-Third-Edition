package com.imooc.ioc.interfaces;

public class Main {
    public static void main(String[] args) {
        OneInterface oif = new OneInterfaceImpl();
        oif.say("world!");
    }
}
