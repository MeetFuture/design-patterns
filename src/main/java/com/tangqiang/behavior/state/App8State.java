package com.tangqiang.behavior.state;

/**
 * 状态模式<br>
 * 定义对象间的一种一对多的依赖关系,当一个对象的状态发生改变时,所有依赖于它的对象都得到通知并被自动更新。<br>
 * <br>适用性<br>
 * 1.一个对象的行为取决于它的状态,并且它必须在运行时刻根据状态改变它的行为。
 * <br>
 * 2.一个操作中含有庞大的多分支的条件语句，且这些分支依赖于该对象的状态。
 * 这个状态通常用一个或多个枚举常量表示。
 * 通常,有多个操作包含这一相同的条件结构。
 * State模式将每一个条件分支放入一个独立的类中。
 * 这使得你可以根据对象自身的情况将对象的状态作为一个对象，这一对象可以不依赖于其他对象而独立变化。<br>
 * <br>参与者<br>
 * 1.Context
 * 定义客户感兴趣的接口。
 * 维护一个ConcreteState子类的实例，这个实例定义当前状态。
 * <br>
 * 2.State
 * 定义一个接口以封装与Context的一个特定状态相关的行为。
 * <br>
 * 3.ConcreteStatesubclasses
 * 每一子类实现一个与Context的一个状态相关的行为。
 *
 * @author tangqiang
 */
public class App8State {

    public static void main(String[] args) {
        WeatherContext ctx1 = new WeatherContext();
        ctx1.setWeather(new Sunshine());
        System.out.println(ctx1.weatherMessage());

        System.out.println("===============");

        ctx1.setWeather(new Rain());
        System.out.println(ctx1.weatherMessage());
    }
}