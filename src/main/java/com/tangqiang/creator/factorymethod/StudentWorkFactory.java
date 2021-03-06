package com.tangqiang.creator.factorymethod;

/**
 * 重定义工厂方法以返回一个ConcreteProduct实例
 *
 * @author tangqiang
 */
public class StudentWorkFactory implements IWorkFactory {

    @Override
    public Work getWork() {
        return new StudentWork();
    }

}
