package com.salmon.design.principle.interfacesegregation;

/**
 * @date 2021-6-13 - 23:15
 * Created by Salmon
 */
public class Bird implements IAnimalAction {

    //    同理，这种情况也不符合接口隔离原则

    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
