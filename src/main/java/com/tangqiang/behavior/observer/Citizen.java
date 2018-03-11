package com.tangqiang.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标知道它的观察者。可以有任意多个观察者观察同一个目标。
 * 提供注册和删除观察者对象的接口。
 *
 * @author tangqiang
 */
public abstract class Citizen {

    List<Policeman> pols = new ArrayList<Policeman>();

    String help = "normal";

    public String getHelp() {
        return this.help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    abstract void sendMessage(String help);


    public void register(Policeman pol) {
        this.pols.add(pol);
    }

    public void unRegister(Policeman pol) {
        this.pols.remove(pol);
    }
}

