package com.tangqiang.behavior.interpreter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 解释操作
 *
 * @author tangqiang
 */
public class AdvanceExpression extends Expression {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    void interpret(Context ctx) {
        logger.info("这是高级解析器!");
    }
}

