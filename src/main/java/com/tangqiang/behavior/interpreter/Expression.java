package com.tangqiang.behavior.interpreter;

/**
 * 声明一个抽象的解释操作，这个接口为抽象语法树中所有的节点所共享
 *
 * @author tangqiang
 */
public abstract class Expression {

    abstract void interpret(Context ctx);
}

