package com.tangqiang.behavior.state;

/**
 * 定义客户感兴趣的接口。
 * 维护一个ConcreteState子类的实例，这个实例定义当前状态。
 *
 * @author tangqiang
 */
public class WeatherContext {

    private Weather weather;

    public Weather getWeather() {
        return this.weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String weatherMessage() {
        return weather.getWeather();
    }
}

