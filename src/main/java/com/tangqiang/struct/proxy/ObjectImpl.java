package com.tangqiang.struct.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 定义Proxy所代表的实体
 *
 * @author tangqiang
 */
public class ObjectImpl implements ObjectFor {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public ObjectImpl() {
        System.out.println("ObjectImpl init");
    }

    @Override
    public void action() {
        logger.info("========这是被代理的类========");
    }
}
