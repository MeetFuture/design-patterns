package com.tangqiang.struct.proxy;

/**
 * 定义RealSubject和Proxy的共用接口，这样就在任何使用RealSubject的地方都可以使用Proxy。
 *
 * @author tangqiang
 */
public interface ObjectFor {
    void action();

}
