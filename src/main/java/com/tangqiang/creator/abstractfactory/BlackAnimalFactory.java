package com.tangqiang.creator.abstractfactory;

/**
 * BlackAnimal 工厂
 * 实现创建具体产品对象的操作
 *
 * @author tangqiang
 */
public class BlackAnimalFactory implements IAnimalFactory {

    @Override
    public ICat createCat() {
        return new BlackCat();
    }

    @Override
    public IDog createDog() {
        return new BlackDog();
    }

}
