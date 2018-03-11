package com.tangqiang.struct.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 维持一个指向Component对象的指针，并定义一个与Component接口一致的接口
 *
 * @author tangqiang
 */
public abstract class Decorator implements Person {
    private Logger logger = LoggerFactory.getLogger(getClass());

    protected Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        logger.info("Decorator.eat ");
        person.eat();
    }
}

