package com.tangqiang.creator.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 抽象工厂
 * <br>
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类
 * <br>
 * <br>
 * 适用性
 * <br>
 * 1.一个系统要独立于它的产品的创建、组合和表示时。
 * <br>
 * 2.一个系统要由多个产品系列中的一个来配置时。
 * <br>
 * 3.当你要强调一系列相关的产品对象的设计以便进行联合使用时。
 * <br>
 * 4.当你提供一个产品类库，而只想显示它们的接口而不是实现时。
 * <br>
 * <br>
 * 参与者
 * <br>
 * 1.AbstractFactory
 * 声明一个创建抽象产品对象的操作接口。
 * <br>
 * 2.ConcreteFactory
 * 实现创建具体产品对象的操作。
 * <br>
 * 3.AbstractProduct
 * 为一类产品对象声明一个接口。
 * <br>
 * 4.ConcreteProduct
 * 定义一个将被相应的具体工厂创建的产品对象。
 * 实现AbstractProduct接口。
 * <br>
 * 5.Client
 * 仅使用由AbstractFactory和AbstractProduct类声明的接口
 *
 * @author tangqiang
 */
public class App1AbstractFactory {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        new App1AbstractFactory().run();
    }

    private void run() {
        logger.info("--------------------------抽象工厂-------------------------");
        IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
        ICat blackCat = blackAnimalFactory.createCat();
        blackCat.eat();
        IDog blackDog = blackAnimalFactory.createDog();
        blackDog.eat();

        IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
        ICat whiteCat = whiteAnimalFactory.createCat();
        whiteCat.eat();
        IDog whiteDog = whiteAnimalFactory.createDog();
        whiteDog.eat();
    }

}
