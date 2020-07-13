package com.po;

public class Coffee {
    private Tea tea;

    public Tea getTea() {
        return tea;
    }

    public Coffee setTea(Tea tea) {
        this.tea = tea;
        return this;
    }

    public Coffee() {
        System.out.println("正在初始化bean-Coffee，调用无参构造函数");
    }
}
