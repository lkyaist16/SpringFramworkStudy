package com.lkyi.demo01;

/**
 * 静态代理：
 * 实现业务的分工
 * 公共业务发生扩展的时候，方便管理
 *
 */
public class Client {
    public static void main(String[] args) {
        OwerOfHouse ower = new OwerOfHouse();
        Proxy proxy = new Proxy(ower);
        proxy.rent();
    }
}
