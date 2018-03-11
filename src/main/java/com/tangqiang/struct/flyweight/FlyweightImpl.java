package com.tangqiang.struct.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 实现Flyweight接口，并为内部状态（如果有的话）增加存储空间。
 * ConcreteFlyweight对象必须是可共享的。它所存储的状态必须是内部的；即，它必须独立于ConcreteFlyweight对象的场景。
 *
 * @author tangqiang
 */
public class FlyweightImpl implements Flyweight {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void action(int arg) {
        logger.info("参数值: " + arg + " From:" + this);
    }
}

