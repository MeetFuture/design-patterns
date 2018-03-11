package com.tangqiang.behavior.observer;

/**
 * 为那些在目标发生改变时需获得通知的对象定义一个更新接口
 *
 * @author tangqiang
 */
public interface Policeman {

    void action(Citizen ci);
}
