package com.tangqiang.behavior.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 定义抽象的原语操作（primitiveoperation），具体的子类将重定义它们以实现一个算法的各步骤。
 * 实现一个模板方法,定义一个算法的骨架。
 * 该模板方法不仅调用原语操作，也调用定义在AbstractClass或其他对象中的操作。
 *
 * @author tangqiang
 */
public abstract class Template {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public abstract void print();

    public void update() {
        logger.info("开始打印");
        for (int i = 0; i < 5; i++) {
            print();
        }
    }
}

