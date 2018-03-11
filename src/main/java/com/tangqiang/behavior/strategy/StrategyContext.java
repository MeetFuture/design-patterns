package com.tangqiang.behavior.strategy;

/**
 * 用一个ConcreteStrategy对象来配置。
 * 维护一个对Strategy对象的引用。
 * 可定义一个接口来让Stategy访问它的数据。
 *
 * @author tangqiang
 */
public class StrategyContext {
    Strategy stra;

    public StrategyContext(Strategy stra) {
        this.stra = stra;
    }

    public void doMethod() {
        stra.method();
    }

}
