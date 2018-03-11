package com.tangqiang.struct.bridge;

/**
 * 定义抽象类的接口。
 * 维护一个指向Implementor类型对象的指针
 *
 * @author tangqiang
 */
public abstract class Person {
    private String type;

//    public Clothing getClothing() {
//        return clothing;
//    }

    public void setClothing() {
//        this.clothing = ClothingFactory.getClothing();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void dress(Clothing clothing);
}
