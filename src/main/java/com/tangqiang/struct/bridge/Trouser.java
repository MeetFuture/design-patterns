package com.tangqiang.struct.bridge;


/**
 * 实现Implementor接口并定义它的具体实现
 *
 * @author tangqiang
 */
public class Trouser extends Clothing {

    @Override
    public void personDressCloth(Person person) {
        System.out.println(person.getType() + "穿裤子");
    }
}

