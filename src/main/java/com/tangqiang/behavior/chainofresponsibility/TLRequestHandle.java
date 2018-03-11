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
public class TLRequestHandle implements RequestHandle {
    RequestHandle rh;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public TLRequestHandle(RequestHandle rh) {
        this.rh = rh;
    }

    @Override
    public void handleRequest(Request request) {
        if (request instanceof LeaveRequest) {
            logger.info("要请假, 项目组长审批!");
            logger.info("处理结束!");
        } else {
            logger.info("项目组长处理不了：" + request);
            rh.handleRequest(request);
        }
    }
}

