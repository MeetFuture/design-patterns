package com.tangqiang.struct.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 保存一个引用使得代理可以访问实体。若RealSubject和Subject的接口相同，Proxy会引用Subject。
 * 提供一个与Subject的接口相同的接口，这样代理就可以用来替代实体。
 * 控制对实体的存取，并可能负责创建和删除它。
 * 其他功能依赖于代理的类型
 *
 * @author tangqiang
 */
public class ProxyObject implements ObjectFor {
    ObjectFor obj;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public ProxyObject() {
        logger.info("ProxyObject init");
        obj = new ObjectImpl();
    }

    @Override
    public void action() {
        logger.info("代理类 代理开始");
        obj.action();
        logger.info("代理类 代理结束");
    }
}
