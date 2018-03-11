package com.tangqiang.behavior.chainofresponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 责任链模式<br>
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，
 * 并沿着这条链传递该请求，直到有一个对象处理它为止。
 * <br>
 * 这一模式的想法是，给多个对象处理一个请求的机会，从而解耦发送者和接受者.<br>
 * <br>适用性<br>
 * 1.有多个的对象可以处理一个请求，哪个对象处理该请求运行时刻自动确定。
 * <br>
 * 2.你想在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。
 * <br>
 * 3.可处理一个请求的对象集合应被动态指定。
 * <br><br>参与者<br>
 * 1.Handler
 * 定义一个处理请求的接口。
 * （可选）实现后继链。
 * <br>
 * 2.ConcreteHandler
 * 处理它所负责的请求。
 * 可访问它的后继者。
 * 如果可处理该请求，就处理之；否则将该请求转发给它的后继者。
 * <br>
 * 3.Client
 * 向链上的具体处理者(ConcreteHandler)对象提交请求。
 *
 * @author tangqiang
 */
public class App1ChainOfResponsibility {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        new App1ChainOfResponsibility().run();
    }

    private void run() {
        logger.info("--------------------------责任链模式-------------------------");
        RequestHandle hr = new HRRequestHandle();
        RequestHandle pm = new PMRequestHandle(hr);
        RequestHandle tl = new TLRequestHandle(pm);

        //team leader处理离职请求
        Request request = new DimissionRequest();
        tl.handleRequest(request);

        logger.info("===========");
        //team leader处理加薪请求
        request = new AddMoneyRequest();
        tl.handleRequest(request);

        logger.info("===========");
        //项目经理上理辞职请求
        request = new DimissionRequest();
        pm.handleRequest(request);
    }
}
