package com.tangqiang.struct.bridge;

/**
 * 扩充由Abstraction定义的接口
 *
 * @author tangqiang
 */
public class Man extends Person {
    public Man() {
        setType("男人");
    }

    @Override
    public void dress(Clothing clothing) {
        clothing.personDressCloth(this);
    }
}
