package com.tangqiang.behavior.iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 迭代器模式<br>
 * 给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。<br>
 * <br>适用性<br>
 * 1.访问一个聚合对象的内容而无需暴露它的内部表示。
 * <br>
 * 2.支持对聚合对象的多种遍历。
 * <br>
 * 3.为遍历不同的聚合结构提供一个统一的接口(即,支持多态迭代)。<br>
 * <br>参与者<br>
 * 1.Iterator
 * 迭代器定义访问和遍历元素的接口。
 * <br>
 * 2.ConcreteIterator
 * 具体迭代器实现迭代器接口。
 * 对该聚合遍历时跟踪当前位置。
 * <br>
 * 3.Aggregate
 * 聚合定义创建相应迭代器对象的接口。
 * <br>
 * 4.ConcreteAggregate
 * 具体聚合实现创建相应迭代器的接口，该操作返回ConcreteIterator的一个适当的实例.
 *
 * @author tangqiang
 */
public class App4Iterator {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        new App4Iterator().run();
    }

    private void run() {
        logger.info("--------------------------迭代器模式-------------------------");
        List list = new ListImpl();
        list.add("a");
        list.add("b");
        list.add("c");
        //第一种迭代方式
        Iterator it = list.iterator();
        while (it.hasNext()) {
            logger.info("" + it.next());
        }

        logger.info("=====");
        //第二种迭代方式
        for (int i = 0; i < list.getSize(); i++) {
            logger.info("" + list.get(i));
        }
    }
}
