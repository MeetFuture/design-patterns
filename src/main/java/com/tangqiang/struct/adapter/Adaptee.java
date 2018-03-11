package com.tangqiang.struct.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 定义一个已经存在的接口，这个接口需要适配
 *
 * @author tangqiang
 */
public class Adaptee {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public void adapteeMethod() {
        logger.info("Adaptee method!");
    }
}
