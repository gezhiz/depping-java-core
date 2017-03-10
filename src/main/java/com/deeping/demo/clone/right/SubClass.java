package com.deeping.demo.clone.right;

import com.deeping.demo.clone.MyClass;

/**
 * Created by gezz on 2017/3/9.
 */
public class SubClass extends SuperClass implements Cloneable{
    public SubClass(String str, MyClass myClass) {
        super(str,myClass);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        SubClass originClass = new SubClass("str",new MyClass(10));
        SubClass cloneClass = originClass.clone();

        System.out.println(originClass.getStr() == cloneClass.getStr());
        System.out.println(originClass.getMyClass() == cloneClass.getMyClass());//originClass和cloneClass的引用类型不是同一个

        System.out.println(cloneClass.getMyClass().getValue());//结果10：问题思考：这个10是哪儿来的？

        MyClass myClass = new MyClass(10);
        myClass.setValue(10);

        originClass.setMyClass(myClass);
        System.out.println(cloneClass.getMyClass().getValue());

        Object o = new Object();
        MyClass myClass1 = (MyClass) o;
        myClass1.setValue(11);
        System.out.println(myClass1);

    }

    @Override
    public SubClass clone() throws CloneNotSupportedException {
        SubClass subClass = (SubClass) super.clone();

        return subClass ;//这是错误的用法
    }



}
