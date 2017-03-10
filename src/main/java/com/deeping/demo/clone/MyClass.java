package com.deeping.demo.clone;


/**
 * 如果没有实现Cloneable接口，则会抛出CloneNotSupportedException异常
 * Created by gezz on 2017/3/9.
 */
public class MyClass implements Cloneable{
    private Integer value;

    public MyClass(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public MyClass clone() throws CloneNotSupportedException {
        MyClass result = (MyClass) super.clone();//问题思考：Myclass的父类是Object，clone方法是一个本地方法clone，为何就就能返回Myclass对象
        result.setValue(value);
        return result;
    }
}
