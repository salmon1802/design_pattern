package com.salmon.design.pattern.creational.factorymethod;

/**
 * @date 2021-6-14 - 20:42
 * Created by Salmon
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
