package com.tangqiang.behavior.strategy;

/**
 * 以Strategy接口实现某具体算法
 *
 * @author tangqiang
 */
public class StrategyImplA extends Strategy {
    @Override
    public void method() {
        System.out.println("这是第一个实现");
    }
}
