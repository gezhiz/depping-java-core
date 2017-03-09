package com.deeping.demo.strategy;

/**
 * Created by gezz on 2017/3/8.
 */
public class StrategyB implements Strategy {
    public void strategy(String input) {
        System.out.println("执行策略B," + input);
    }
}
