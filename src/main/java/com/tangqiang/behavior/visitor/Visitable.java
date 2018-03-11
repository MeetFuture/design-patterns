package com.tangqiang.behavior.visitor;

/**
 * Element
 * 定义一个Accept操作，它以一个访问者为参数
 *
 * @author tangqiang
 */
public interface Visitable {

    public void accept(Visitor visitor);
}

