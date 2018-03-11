package com.tangqiang.struct.composite;

/**
 * 在组合中表示叶节点对象，叶节点没有子节点。
 * 在组合中定义节点对象的行为。
 *
 * @author tangqiang
 */
public class Programmer extends Employer {

    public Programmer(String name) {
        setName(name);
        employers = null;//程序员, 表示没有下属了
    }

    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}

