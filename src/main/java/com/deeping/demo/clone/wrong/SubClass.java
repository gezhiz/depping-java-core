package com.deeping.demo.clone.wrong;

import com.deeping.demo.clone.MyClass;

/**
 * Created by gezz on 2017/3/9.
 */
public class SubClass extends SuperClass implements Cloneable{
    public SubClass(String str, MyClass myClass) {
        super(str,myClass);
    }

    public static void main(String[] args) {
        SubClass originClass = new SubClass("str",new MyClass(10));
        SubClass cloneClass = originClass.clone();

        System.out.println(originClass.getStr() == cloneClass.getStr());
        System.out.println(originClass.getMyClass() == cloneClass.getMyClass());

        MyClass myClass = new MyClass(10);
        myClass.setValue(10);

        originClass.setMyClass(myClass);
        System.out.println(cloneClass.getMyClass().getValue());

    }

    @Override
    public SubClass clone() {
        SubClass subClass = (SubClass) super.clone();
        try {
            subClass.setMyClass(this.getMyClass().clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return subClass ;//这是错误的用法
    }



}
