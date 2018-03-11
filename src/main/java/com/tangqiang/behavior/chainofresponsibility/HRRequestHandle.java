package com.tangqiang.behavior.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 处理它所负责的请求。
 * 可访问它的后继者。
 * 如果可处理该请求，就处理之；否则将该请求转发给它的后继者。
 *
 * @author tangqiang
 */
public class HRRequestHandle implements RequestHandle {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void handleRequest(Request request) {
        if (request instanceof DimissionRequest) {
            logger.info("要离职, 人事审批!");
        }
        logger.info("请求完毕");
    }
}
