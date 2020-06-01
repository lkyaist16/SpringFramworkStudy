package com.lkyi.pojo;

import org.springframework.beans.factory.annotation.Value;

public class User {

    @Value("David")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
        System.out.println("调用无参构造器创建User");
    }

    public void init() {
        System.out.println("初始化User");
    }

    public void destroy() {
        System.out.println("销毁User");
    }
}
