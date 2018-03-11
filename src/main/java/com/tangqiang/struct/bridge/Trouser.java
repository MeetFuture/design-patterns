package com.tangqiang.struct.bridge;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 实现Implementor接口并定义它的具体实现
 *
 * @author tangqiang
 */
public class Trouser extends Clothing {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void personDressCloth(Person person) {
        logger.info(person.getType() + "穿裤子");
    }
}

