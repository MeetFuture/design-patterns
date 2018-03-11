package com.tangqiang.struct.decorator;

/**
 * 向组件添加职责。
 *
 * @author tangqiang
 */
public class ManDecoratorA extends Decorator {

    @Override
    public void eat() {
        System.out.println("ManDecoratorA类");
        super.eat();
        reEat();
    }

    public void reEat() {
        System.out.println("再吃一顿饭");
    }
}

