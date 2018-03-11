package com.tangqiang.creator.singleton;

/**
 * 单态模式
 * <br>
 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * <br>
 * <br>
 * 适用性
 * <br>
 * 1.当类只能有一个实例而且客户可以从一个众所周知的访问点访问它时。
 * <br>
 * 2.当这个唯一实例应该是通过子类化可扩展的，并且客户应该无需更改代码就能使用一个扩展的实例时。
 * <br>
 * <br>
 * 参与者
 * <br>
 * Singleton
 * <br>
 * 定义一个Instance操作，允许客户访问它的唯一实例。Instance是一个类操作。
 * 可能负责创建它自己的唯一实例。
 *
 * @author tangqiang
 */
public class App3Singleton {

    public static void main(String[] args) {
        Singleton sing = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();

        System.out.println(sing);
        System.out.println(sing2);
        System.out.println(sing == sing2);
        System.out.println(sing.equals(sing2));
    }

}
