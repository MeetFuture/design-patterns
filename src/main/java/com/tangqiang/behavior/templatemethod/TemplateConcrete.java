package com.tangqiang.behavior.templatemethod;


/**
 * 实现原语操作以完成算法中与特定子类相关的步骤
 *
 * @author tangqiang
 */
public class TemplateConcrete extends Template {

    @Override
    public void print() {
        System.out.println("这是子类的实现");
    }
}

