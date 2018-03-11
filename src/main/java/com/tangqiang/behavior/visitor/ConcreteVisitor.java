package com.tangqiang.behavior.visitor;

import java.util.Collection;
import java.util.Iterator;

/**
 * ConcreteVisitor
 * 实现每个由Visitor声明的操作。
 * 每个操作实现本算法的一部分，而该算法片断乃是对应于结构中对象的类。
 * ConcreteVisitor为该算法提供了上下文并存储它的局部状态。
 * 这一状态常常在遍历该结构的过程中累积结果。
 *
 * @author tangqiang
 */
public class ConcreteVisitor implements Visitor {

    @Override
    public void visitCollection(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Visitable) {
                ((Visitable) o).accept(this);
            }
        }
    }

    @Override
    public void visitFloat(FloatElement floatE) {
        System.out.println(floatE.getFe());
    }

    @Override
    public void visitString(StringElement stringE) {
        System.out.println(stringE.getSe());
    }
}

