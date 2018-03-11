package com.tangqiang.struct.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 为组合中的对象声明接口。
 * 在适当的情况下，实现所有类共有接口的缺省行为。
 * 声明一个接口用于访问和管理Component的子组件。
 * (可选)在递归结构中定义一个接口，用于访问一个父部件，并在合适的情况下实现它。
 *
 * @author tangqiang
 */
public abstract class Employer {
    public List<Employer> employers;
    private Logger logger = LoggerFactory.getLogger(getClass());
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(Employer employer);

    public abstract void delete(Employer employer);

    public void printInfo() {
        logger.info(name);
        logger.info("-----------------" + name + " start-----------------");
        if (employers != null && employers.size() > 0) {
            for (Employer em : employers) {
                em.printInfo();
            }
        }
        logger.info("-----------------" + name + " end-----------------");
    }

    public List<Employer> getEmployers() {
        return this.employers;
    }
}

