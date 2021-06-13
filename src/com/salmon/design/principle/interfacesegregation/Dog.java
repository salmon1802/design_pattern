package com.salmon.design.principle.interfacesegregation;

/**
 * @date 2021-6-13 - 23:14
 * Created by Salmon
 */
//public class Dog implements IAnimalAction {
//
//    //这种情况就不符合接口隔离原则，因为此时狗不会飞，但是此类必须实现一个没有作用的方法
//
//    @Override
//    public void eat() {
//
//    }
//
//    @Override
//    public void fly() {
//
//    }
//
//    @Override
//    public void swim() {
//
//    }
//}

public class Dog implements IEatAnimalAction,ISwimAnimalAction{
    //只需要实现需要的方法即可
    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}