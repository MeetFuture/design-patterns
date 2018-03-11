package com.tangqiang.creator.builder;

/**
 * Builder
 * 为创建一个Product对象的各个部件指定抽象接口
 *
 * @author tangqiang
 */
public interface PersonBuilder {

    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
