package com.salmon.design.principle.singleresponsibility;

/**
 * @date 2021-6-13 - 22:49
 * Created by Salmon
 */
public interface ICourse {
    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
