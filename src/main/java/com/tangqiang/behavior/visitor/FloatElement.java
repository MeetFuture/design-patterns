package com.tangqiang.behavior.visitor;

/**
 * ConcreteElement
 * 实现Accept操作，该操作以一个访问者为参数
 *
 * @author tangqiang
 */
public class FloatElement implements Visitable {

    private Float fe;

    public FloatElement(Float fe) {
        this.fe = fe;
    }

    public Float getFe() {
        return this.fe;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitFloat(this);
    }
}
