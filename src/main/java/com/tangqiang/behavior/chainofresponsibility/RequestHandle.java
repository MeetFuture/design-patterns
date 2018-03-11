package com.tangqiang.behavior.chainofresponsibility;

/**
 * 定义一个处理请求的接口。（可选）实现后继链
 *
 * @author tangqiang
 */
public interface RequestHandle {

    void handleRequest(Request request);
}

