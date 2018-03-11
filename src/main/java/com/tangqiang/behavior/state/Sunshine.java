package com.tangqiang.behavior.state;

/**
 * 每一子类实现一个与Context的一个状态相关的行为
 *
 * @author tangqiang
 */
public class Sunshine implements Weather {

    @Override
    public String getWeather() {
        return "阳光";
    }
}
