package com.tangqiang.creator.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 实现Product(工厂方法所创建的对象的接口)
 *
 * @author tangqiang
 */
public class StudentWork implements Work {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void doWork() {
        logger.info("学生做作业!");
    }

}
