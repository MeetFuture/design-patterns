package com.tangqiang.behavior.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 中介者模式<br>
 * 用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。<br>
 * <br>适用性<br>
 * 1.一组对象以定义良好但是复杂的方式进行通信。产生的相互依赖关系结构混乱且难以理解。
 * <br>
 * 2.一个对象引用其他很多对象并且直接与这些对象通信,导致难以复用该对象。
 * <br>
 * 3.想定制一个分布在多个类中的行为，而又不想生成太多的子类。<br>
 * <br>参与者<br>
 * 1.Mediator
 * 中介者定义一个接口用于与各同事（Colleague）对象通信。
 * <br>
 * 2.ConcreteMediator
 * 具体中介者通过协调各同事对象实现协作行为。
 * 了解并维护它的各个同事。
 * <br>
 * 3.Colleagueclass
 * 每一个同事类都知道它的中介者对象。
 * 每一个同事对象在需与其他的同事通信的时候，与它的中介者通信
 *
 * @author tangqiang
 */
public class App5Mediator {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        new App5Mediator().run();
    }

    private void run() {
        logger.info("--------------------------中介者模式-------------------------");
        Mediator med = new ConcreteMediator();
        //老板来了
        med.notice("boss");

        //客户来了
        med.notice("client");
    }
}
