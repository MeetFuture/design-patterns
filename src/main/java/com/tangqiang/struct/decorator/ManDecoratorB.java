package com.tangqiang.struct.decorator;

/**
 * 向组件添加职责。
 *
 * @author tangqiang
 */
public class ManDecoratorB extends Decorator {

    @Override
    public void eat() {
        System.out.println("===============");
        System.out.println("ManDecoratorB类");
        super.eat();
    }
}

