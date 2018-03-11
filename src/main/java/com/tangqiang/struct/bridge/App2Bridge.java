package com.tangqiang.struct.bridge;


/**
 * 桥接模式<br>
 * 将抽象部分与它的实现部分分离，使它们都可以独立地变化
 * <br>
 * <br>
 * 适用性<br>
 * 1.你不希望在抽象和它的实现部分之间有一个固定的绑定关系。
 * 例如这种情况可能是因为，在程序运行时刻实现部分应可以被选择或者切换。
 * <br>
 * 2.类的抽象以及它的实现都应该可以通过生成子类的方法加以扩充。
 * 这时Bridge模式使你可以对不同的抽象接口和实现部分进行组合，并分别对它们进行扩充。
 * <br>
 * 3.对一个抽象的实现部分的修改应对客户不产生影响，即客户的代码不必重新编译。
 * <br>
 * 4.正如在意图一节的第一个类图中所示的那样，有许多类要生成。
 * 这样一种类层次结构说明你必须将一个对象分解成两个部分。
 * <br>
 * 5.你想在多个对象间共享实现（可能使用引用计数），但同时要求客户并不知道这一点。
 * <br>
 * <br>
 * 参与者<br>
 * 1.Abstraction
 * 定义抽象类的接口。
 * 维护一个指向Implementor类型对象的指针。
 * <br>
 * 2.RefinedAbstraction
 * 扩充由Abstraction定义的接口。
 * <br>
 * 3.Implementor
 * 定义实现类的接口，该接口不一定要与Abstraction的接口完全一致。
 * 事实上这两个接口可以完全不同。
 * 一般来讲，Implementor接口仅提供基本操作，而Abstraction则定义了基于这些基本操作的较高层次的操作。
 * <br>
 * 4.ConcreteImplementor
 * 实现Implementor接口并定义它的具体实现。
 *
 * @author tangqiang
 */
public class App2Bridge {
    public static void main(String[] args) {
        Person man = new Man();
        Person lady = new Lady();
        Clothing jacket = new Jacket();
        Clothing trouser = new Trouser();


        man.dress(jacket);
        man.dress(trouser);

        lady.dress(jacket);
        lady.dress(trouser);

        jacket.personDressCloth(man);
        trouser.personDressCloth(man);

        jacket.personDressCloth(lady);
        trouser.personDressCloth(lady);
    }

}
