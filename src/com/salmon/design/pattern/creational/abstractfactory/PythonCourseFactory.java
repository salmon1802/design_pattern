package com.salmon.design.pattern.creational.abstractfactory;

/**
 * @date 2021-6-14 - 21:31
 * Created by Salmon
 */
public class PythonCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
