package com.salmon.design.pattern.creational.abstractfactory;

/**
 * @date 2021-6-14 - 21:26
 * Created by Salmon
 */
public class JavaCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
