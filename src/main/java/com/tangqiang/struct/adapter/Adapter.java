package com.tangqiang.struct.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 对Adaptee的接口与Target接口进行适配
 *
 * @author tangqiang
 */
public class Adapter implements Target {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void adapteeMethod() {
        logger.info("adaptee.adapteeMethod");
        adaptee.adapteeMethod();
    }

    @Override
    public void adapterMethod() {
        logger.info("Adapter method!");
    }

}
