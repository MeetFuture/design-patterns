package com.tangqiang.creator.abstractfactory;

/**
 * 抽象工厂
 * 声明一个创建抽象产品对象的操作接口
 *
 * @author tangqiang
 */
public interface IAnimalFactory {
    ICat createCat();

    IDog createDog();
}
