package com.tangqiang.creator.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 实现Builder的接口以构造和装配该产品的各个部件。
 * 定义并明确它所创建的表示。
 * 提供一个检索产品的接口。
 */

public class ManBuilder implements PersonBuilder {
    Person person;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public ManBuilder() {
        person = new Man();
    }

    @Override
    public void buildBody() {
        logger.info("建造男人的身体");
        person.setBody("男人的身体");
    }

    @Override
    public void buildFoot() {
        logger.info("建造男人的脚");
        person.setFoot("男人的脚");
    }

    @Override
    public void buildHead() {
        logger.info("建造男人的头");
        person.setHead("男人的头");
    }

    @Override
    public Person buildPerson() {
        logger.info("buildPerson");
        return person;
    }
}
