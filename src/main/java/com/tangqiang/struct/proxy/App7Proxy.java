package com.tangqiang.struct.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 代理模式<br>
 * 为其他对象提供一种代理以控制对这个对象的访问。<br>
 * <br>适用性<br>
 * 1.远程代理（RemoteProxy）为一个对象在不同的地址空间提供局部代表。
 * <br>
 * 2.虚代理（VirtualProxy）根据需要创建开销很大的对象。
 * <br>
 * 3.保护代理（ProtectionProxy）控制对原始对象的访问。
 * <br>
 * 4.智能指引（SmartReference）取代了简单的指针，它在访问对象时执行一些附加操作。<br>
 * <br>参与者<br>
 * 1.Proxy
 * 保存一个引用使得代理可以访问实体。若RealSubject和Subject的接口相同，Proxy会引用Subject。
 * 提供一个与Subject的接口相同的接口，这样代理就可以用来替代实体。
 * 控制对实体的存取，并可能负责创建和删除它。
 * 其他功能依赖于代理的类型：
 * <br>
 * 2.RemoteProxy负责对请求及其参数进行编码，并向不同地址空间中的实体发送已编码的请求。
 * <br>
 * 3.VirtualProxy可以缓存实体的附加信息，以便延迟对它的访问。
 * <br>
 * 4.ProtectionProxy检查调用者是否具有实现一个请求所必需的访问权限。
 * <br>
 * 5.Subject
 * 定义RealSubject和Proxy的共用接口，这样就在任何使用RealSubject的地方都可以使用Proxy。
 * <br>
 * 6.RealSubject
 * 定义Proxy所代表的实体。
 *
 * @author tangqiang
 */
public class App7Proxy {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        new App7Proxy().run();
    }

    private void run() {
        logger.info("--------------------------代理模式-------------------------");
        ObjectFor obj = new ProxyObject();
        obj.action();
    }

}
