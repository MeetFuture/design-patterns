package com.tangqiang.behavior.memento;

/**
 * 负责保存好备忘录。
 * 不能对备忘录的内容进行操作或检查。
 *
 * @author tangqiang
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return this.memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
