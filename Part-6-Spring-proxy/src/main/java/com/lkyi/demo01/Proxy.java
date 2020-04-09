package com.lkyi.demo01;

public class Proxy implements Rent{

    private OwerOfHouse owerOfHouse;

    public Proxy() {
    }

    public Proxy(OwerOfHouse owerOfHouse) {
        this.owerOfHouse = owerOfHouse;
    }

    public void rent() {
        owerOfHouse.rent();
        this.seeHouse();
        this.sign();
        this.fare();
    }

    public void seeHouse() {
        System.out.println("中介带你看房！");
    }

    public void sign() {
        System.out.println("签租赁合同！");
    }

    public void fare() {
        System.out.println("收中介费！");
    }
}
