package com.tangqiang.creator.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 工厂方法
 * <br>
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。FactoryMethod使一个类的实例化延迟到其子类。
 * <br>
 * <br>
 * 适用性
 * <br>
 * 1.当一个类不知道它所必须创建的对象的类的时候。
 * <br>
 * 2.当一个类希望由它的子类来指定它所创建的对象的时候。
 * <br>
 * 3.当类将创建对象的职责委托给多个帮助子类中的某一个，并且你希望将哪一个帮助子类是代理者这一信息局部化的时候。
 * <br>
 * <br>
 * 参与者
 * <br>
 * 1.Product
 * 定义工厂方法所创建的对象的接口。
 * <br>
 * 2.ConcreteProduct
 * 实现Product接口。
 * <br>
 * 3.Creator
 * 声明工厂方法，该方法返回一个Product类型的对象。
 * Creator也可以定义一个工厂方法的缺省实现，它返回一个缺省的ConcreteProduct对象。
 * 可以调用工厂方法以创建一个Product对象。
 * <br>
 * 4.ConcreteCreator
 * 重定义工厂方法以返回一个ConcreteProduct实例。
 *
 * @author tangqiang
 */
public class App2FactoryMethod {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        new App2FactoryMethod().run();
    }

    private void run() {
        logger.info("--------------------------工厂方法-------------------------");
        IWorkFactory studentWorkFactory = new StudentWorkFactory();
        studentWorkFactory.getWork().doWork();

        IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getWork().doWork();
    }

}
