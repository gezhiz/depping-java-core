package com.deeping.demo.clone.right;

import com.deeping.demo.clone.MyClass;

/**
 * Created by gezz on 2017/3/9.
 */
public class SuperClass implements Cloneable {
    private String str;
    private MyClass myClass;

    public SuperClass(String str, MyClass myClass) {
        this.str = str;
        this.myClass = myClass;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        SuperClass superClass = (SuperClass) super.clone();
        superClass.setStr(str.toString());
        superClass.setMyClass(myClass.clone());
        return superClass;//这是错误的用法
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public MyClass getMyClass() {
        return myClass;
    }

    public void setMyClass(MyClass myClass) {
        this.myClass = myClass;
    }
}
