package com.tangqiang.behavior.strategy;

/**
 * 定义所有支持的算法的公共接口。Context使用这个接口来调用某ConcreteStrategy定义的算法
 *
 * @author tangqiang
 */
public abstract class Strategy {

    public abstract void method();
}

