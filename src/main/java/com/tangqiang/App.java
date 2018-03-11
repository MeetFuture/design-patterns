package com.tangqiang;

import com.tangqiang.behavior.chainofresponsibility.App1ChainOfResponsibility;
import com.tangqiang.behavior.command.App2Command;
import com.tangqiang.behavior.interpreter.App3Interpreter;
import com.tangqiang.behavior.iterator.App4Iterator;
import com.tangqiang.behavior.mediator.App5Mediator;
import com.tangqiang.behavior.memento.App6Memento;
import com.tangqiang.behavior.observer.App7Observer;
import com.tangqiang.behavior.state.App8State;
import com.tangqiang.behavior.strategy.App9Strategy;
import com.tangqiang.behavior.templatemethod.App10TemplateMethod;
import com.tangqiang.behavior.visitor.App11Visitor;
import com.tangqiang.creator.abstractfactory.App1AbstractFactory;
import com.tangqiang.creator.builder.App4Builder;
import com.tangqiang.creator.factorymethod.App2FactoryMethod;
import com.tangqiang.creator.prototype.App5Prototype;
import com.tangqiang.creator.singleton.App3Singleton;
import com.tangqiang.struct.adapter.App1Adapter;
import com.tangqiang.struct.bridge.App2Bridge;
import com.tangqiang.struct.composite.App3Composite;
import com.tangqiang.struct.decorator.App4Decorator;
import com.tangqiang.struct.facade.App5Facade;
import com.tangqiang.struct.flyweight.App6Flyweight;
import com.tangqiang.struct.proxy.App7Proxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * App
 *
 * @author tangqiang
 */
public class App {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        App th = new App();
        th.creator();
        th.struct();
        th.behavior();
    }

    private void creator() {
        logger.info("------------------------------------------------creator ------------------------------------------------------------");
        App1AbstractFactory.main(null);
        App2FactoryMethod.main(null);
        App3Singleton.main(null);
        App4Builder.main(null);
        App5Prototype.main(null);
    }

    private void struct() {
        logger.info("------------------------------------------------struct ------------------------------------------------------------");
        App1Adapter.main(null);
        App2Bridge.main(null);
        App3Composite.main(null);
        App4Decorator.main(null);
        App5Facade.main(null);
        App6Flyweight.main(null);
        App7Proxy.main(null);
    }

    private void behavior() {
        logger.info("------------------------------------------------behavior ------------------------------------------------------------");
        App1ChainOfResponsibility.main(null);
        App2Command.main(null);
        App3Interpreter.main(null);
        App4Iterator.main(null);
        App5Mediator.main(null);
        App6Memento.main(null);
        App7Observer.main(null);
        App8State.main(null);
        App9Strategy.main(null);
        App10TemplateMethod.main(null);
        App11Visitor.main(null);
    }

}
