package com.salmon.design.pattern.creational.factorymethod;

/**
 * @date 2021-6-14 - 17:46
 * Created by Salmon
 */

//这里既可以使用接口定义，也可以使用抽象方法定义
    //但在实际的工程中一个类里总是会有已经实现了的方法的
    //所以一般使用abstract修饰
    //如果此类全员都是抽象方法，那么大可以使用interface

    //这里的factory只是起到规范的作用，并不决定产生哪一类的对象，完全交由子类来决定
    //这就是工厂模式核心思想
public abstract class VideoFactory {

    public abstract Video getVideo();


}
