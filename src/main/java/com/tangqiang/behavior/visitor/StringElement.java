package com.tangqiang.behavior.visitor;

/**
 * ConcreteElement
 * 实现Accept操作，该操作以一个访问者为参数
 *
 * @author tangqiang
 */
public class StringElement implements Visitable {

    private String se;

    public StringElement(String se) {
        this.se = se;
    }

    public String getSe() {
        return this.se;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}

