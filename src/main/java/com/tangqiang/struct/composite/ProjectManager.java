package com.tangqiang.struct.composite;

import java.util.ArrayList;

/**
 * 定义有子部件的那些部件的行为。
 * 存储子部件。
 * 在Component接口中实现与子部件有关的操作
 *
 * @author tangqiang
 */
public class ProjectManager extends Employer {

    public ProjectManager(String name) {
        setName(name);
        employers = new ArrayList();
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void delete(Employer employer) {
        employers.remove(employer);
    }
}

