package com.salmon.design.pattern.creational.factorymethod;

/**
 * @date 2021-6-14 - 17:44
 * Created by Salmon
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory1 = new JavaVideoFactory();
        //如果我们需要新建
        VideoFactory videoFactory2 = new FEVideoFactory();
        VideoFactory videoFactory3 = new PythonVideoFactory();

        Video video1 = videoFactory1.getVideo();
        video1.produce();
        Video video2 = videoFactory2.getVideo();
        video2.produce();

        Video video3 = videoFactory3.getVideo();
        video3.produce();


    }





}