package com.deeping.demo.strategy;

/**
 * Created by gezz on 2017/3/8.
 */
public class AppMain {
    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        context.action("哈哈");
    }
}
