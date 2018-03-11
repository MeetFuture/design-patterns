package com.tangqiang.creator.prototype;

/**
 * 声明一个克隆自身的接口
 *
 * @author tangqiang
 */
public class Prototype implements Cloneable {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
