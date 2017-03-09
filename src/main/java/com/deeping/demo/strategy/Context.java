package com.deeping.demo.strategy;

/**
 * 决策者，决定使用哪种策略
 * 为客户端提供一个Context类，降低客户端与策略之间的耦合
 * Created by gezz on 2017/3/8.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void action(String input) {
        strategy.strategy(input);
    }

}
