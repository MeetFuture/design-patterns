package com.tangqiang.creator.singleton;

/**
 * 定义一个Instance操作，允许客户访问它的唯一实例。Instance是一个类操作。
 * 可能负责创建它自己的唯一实例。
 *
 * @author tangqiang
 */
public class Singleton {

    private static Singleton sing;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (sing == null) {
            sing = new Singleton();
        }
        return sing;
    }
}
