package com.tangqiang.behavior.iterator;

/**
 * 具体迭代器实现迭代器接口。
 * 对该聚合遍历时跟踪当前位置
 *
 * @author tangqiang
 */
public class IteratorImpl implements Iterator {

    private List list;

    private int index;

    public IteratorImpl(List list) {
        index = 0;
        this.list = list;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void last() {
        index = list.getSize();
    }

    @Override
    public Object next() {
        Object obj = list.get(index);
        index++;
        return obj;
    }

    @Override
    public boolean hasNext() {
        return index < list.getSize();
    }

}
