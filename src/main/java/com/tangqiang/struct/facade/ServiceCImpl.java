package com.tangqiang.struct.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 实现子系统的功能。
 * 处理由Facade对象指派的任务。
 * 没有facade的任何相关信息；即没有指向facade的指针
 *
 * @author tangqiang
 */
public class ServiceCImpl implements ServiceC {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void methodC() {
        logger.info("这是服务C");
    }
}

