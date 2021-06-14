package com.salmon.design.pattern.creational.abstractfactory;

/**
 * @date 2021-6-14 - 21:32
 * Created by Salmon
 */
public class Test {
    public static void main(String[] args) {
        //一个产品族
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
