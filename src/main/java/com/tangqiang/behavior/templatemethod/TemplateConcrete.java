package com.tangqiang.behavior.templatemethod;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 实现原语操作以完成算法中与特定子类相关的步骤
 *
 * @author tangqiang
 */
public class TemplateConcrete extends Template {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void print() {
        logger.info("这是子类的实现");
    }
}

