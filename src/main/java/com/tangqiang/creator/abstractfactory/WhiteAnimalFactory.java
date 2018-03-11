package com.tangqiang.creator.abstractfactory;

/**
 * WhiteAnimal 工厂
 * 实现创建具体产品对象的操作
 *
 * @author tangqiang
 */
public class WhiteAnimalFactory implements IAnimalFactory {

    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

    @Override
    public IDog createDog() {
        return new WhiteDog();
    }

}
