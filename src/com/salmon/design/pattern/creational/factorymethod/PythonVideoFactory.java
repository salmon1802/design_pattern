package com.salmon.design.pattern.creational.factorymethod;

/**
 * @date 2021-6-14 - 20:34
 * Created by Salmon
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }


}
