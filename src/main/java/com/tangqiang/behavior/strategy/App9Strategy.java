package com.tangqiang.behavior.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 策略模式<br>
 * 定义一系列的算法,把它们一个个封装起来,并且使它们可相互替换。本模式使得算法可独立于使用它的客户而变化。<br>
 * <br>适用性<br>
 * 1.许多相关的类仅仅是行为有异。“策略”提供了一种用多个行为中的一个行为来配置一个类的方法。
 * <br>
 * 2.需要使用一个算法的不同变体。
 * <br>
 * 3.算法使用客户不应该知道的数据。可使用策略模式以避免暴露复杂的、与算法相关的数据结构。
 * <br>
 * 4.一个类定义了多种行为,并且这些行为在这个类的操作中以多个条件语句的形式出现。
 * 将相关的条件分支移入它们各自的Strategy类中以代替这些条件语句。<br>
 * <br>参与者<br>
 * 1.Strategy
 * 定义所有支持的算法的公共接口。Context使用这个接口来调用某ConcreteStrategy定义的算法。
 * <br>
 * 2.ConcreteStrategy
 * 以Strategy接口实现某具体算法。
 * <br>
 * 3.Context
 * 用一个ConcreteStrategy对象来配置。
 * 维护一个对Strategy对象的引用。
 * 可定义一个接口来让Stategy访问它的数据。
 *
 * @author tangqiang
 */
public class App9Strategy {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        App9Strategy th = new App9Strategy();
        th.run();
    }

    private void run() {
        logger.info("--------------------------策略模式-------------------------");
        StrategyContext ctx = new StrategyContext(new StrategyImplA());
        ctx.doMethod();

        ctx = new StrategyContext(new StrategyImplB());
        ctx.doMethod();

        ctx = new StrategyContext(new StrategyImplC());
        ctx.doMethod();
    }

}
