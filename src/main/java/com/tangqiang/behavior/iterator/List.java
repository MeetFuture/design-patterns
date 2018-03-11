package com.tangqiang.behavior.iterator;

/**
 * 聚合定义创建相应迭代器对象的接口
 *
 * @author tangqiang
 */
public interface List {

    Iterator iterator();

    Object get(int index);

    int getSize();

    void add(Object obj);
}
