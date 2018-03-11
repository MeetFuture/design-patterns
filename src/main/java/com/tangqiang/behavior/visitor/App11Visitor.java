package com.tangqiang.behavior.visitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式<br>
 * 表示一个作用于某对象结构中的各元素的操作。
 * 它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。<br>
 * <br>适用性<br>
 * 1.一个对象结构包含很多类对象，它们有不同的接口，而你想对这些对象实施一些依赖于其具体类的操作。
 * <br>
 * 2.需要对一个对象结构中的对象进行很多不同的并且不相关的操作，而你想避免让这些操作“污染”这些对象的类。
 * Visitor使得你可以将相关的操作集中起来定义在一个类中。
 * 当该对象结构被很多应用共享时，用Visitor模式让每个应用仅包含需要用到的操作。
 * <br>
 * 3.定义对象结构的类很少改变，但经常需要在此结构上定义新的操作。
 * 改变对象结构类需要重定义对所有访问者的接口，这可能需要很大的代价。
 * 如果对象结构类经常改变，那么可能还是在这些类中定义这些操作较好。<br>
 * <br>参与者<br>
 * 1.Visitor
 * 为该对象结构中ConcreteElement的每一个类声明一个Visit操作。
 * 该操作的名字和特征标识了发送Visit请求给该访问者的那个类。
 * 这使得访问者可以确定正被访问元素的具体的类。
 * 这样访问者就可以通过该元素的特定接口直接访问它。
 * <br>
 * 2.ConcreteVisitor
 * 实现每个由Visitor声明的操作。
 * 每个操作实现本算法的一部分，而该算法片断乃是对应于结构中对象的类。
 * ConcreteVisitor为该算法提供了上下文并存储它的局部状态。
 * 这一状态常常在遍历该结构的过程中累积结果。
 * <br>
 * 3.Element
 * 定义一个Accept操作，它以一个访问者为参数。
 * <br>
 * 4.ConcreteElement
 * 实现Accept操作，该操作以一个访问者为参数。
 * <br>
 * 5.ObjectStructure
 * 能枚举它的元素。
 * 可以提供一个高层的接口以允许该访问者访问它的元素。
 * 可以是一个复合或是一个集合，如一个列表或一个无序集合。
 *
 * @author tangqiang
 */
public class App11Visitor {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        new App11Visitor().run();
    }

    private void run() {
        logger.info("--------------------------访问者模式-------------------------");
        Visitor visitor = new ConcreteVisitor();
        StringElement se = new StringElement("abc");
        se.accept(visitor);

        FloatElement fe = new FloatElement(new Float(1.5));
        fe.accept(visitor);


        logger.info("===========");

        List result = new ArrayList();
        result.add(new StringElement("abc"));
        result.add(new StringElement("abc"));
        result.add(new StringElement("abc"));

        result.add(new FloatElement(new Float(1.5)));
        result.add(new FloatElement(new Float(1.5)));
        result.add(new FloatElement(new Float(1.5)));
        visitor.visitCollection(result);
    }

}
