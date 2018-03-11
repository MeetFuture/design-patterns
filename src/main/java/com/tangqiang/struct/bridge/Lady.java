package com.tangqiang.struct.bridge;


/**
 * 扩充由Abstraction定义的接口
 *
 * @author tangqiang
 */
public class Lady extends Person {

    public Lady() {
        setType("女人");
    }

    @Override
    public void dress(Clothing clothing) {
        clothing.personDressCloth(this);
    }
}

