package com.salmon.design.principle.singleresponsibility;

/**
 * @date 2021-6-13 - 22:54
 * Created by Salmon
 */
public class CourseImpl implements ICourseManager,ICourseContent{
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
