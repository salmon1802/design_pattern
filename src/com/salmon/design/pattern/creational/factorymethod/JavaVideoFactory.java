package com.salmon.design.pattern.creational.factorymethod;

/**
 * @date 2021-6-14 - 20:33
 * Created by Salmon
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
