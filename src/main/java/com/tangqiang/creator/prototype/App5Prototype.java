package com.tangqiang.creator.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 原型模式
 * <br>
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * <br>
 * <br>
 * 适用性
 * <br>
 * 1.当一个系统应该独立于它的产品创建、构成和表示时。
 * <br>
 * 2.当要实例化的类是在运行时刻指定时，例如，通过动态装载。
 * <br>
 * 3.为了避免创建一个与产品类层次平行的工厂类层次时。
 * <br>
 * 4.当一个类的实例只能有几个不同状态组合中的一种时。
 * <br>
 * 建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
 * <br>
 * <br>
 * 参与者
 * <br>
 * 1. Prototype
 * 声明一个克隆自身的接口。
 * <br>
 * 2. ConcretePrototype
 * 实现一个克隆自身的操作。
 * <br>
 * 3. Client
 * 让一个原型克隆自身从而创建一个新的对象。
 *
 * @author tangqiang
 */
public class App5Prototype {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        new App5Prototype().run();
    }

    private void run() {
        logger.info("--------------------------原型模式-------------------------");
        Prototype pro = new ConcretePrototype("prototype");
        Prototype pro2 = (Prototype) pro.clone();

        logger.info("pro:" + pro);
        logger.info("pro2:" + pro2);

        logger.info("pro.getName:" + pro.getName());
        logger.info("pro2.getName:" + pro2.getName());
        logger.info("pro == pro2   " + (pro == pro2));
        logger.info("pro.equals(pro2)  " + pro.equals(pro2));
    }
}
