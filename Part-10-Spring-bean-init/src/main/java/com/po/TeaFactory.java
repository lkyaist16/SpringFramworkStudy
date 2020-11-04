package com.po;

public class TeaFactory {
    public static Tea getInstance() {
        System.out.println("正在初始化bean-Tea，调用TeaFactory静态工厂方法");
        return new Tea();
    }

}
