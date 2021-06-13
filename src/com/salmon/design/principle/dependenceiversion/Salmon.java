package com.salmon.design.principle.dependenceiversion;

/**
 * @date 2021-6-13 - 21:31
 * Created by Salmon
 */
public class Salmon {

    public void setIcourse(Icourse icourse) {
        this.icourse = icourse;
    }

    Icourse icourse;

//    public Salmon(Icourse icourse) {
//        this.icourse = icourse;
//    }

    //    public void studyJavaCourse(){
//        System.out.println("salmon在学习Java课程");
//    }
//
//    public void studyFECourse(){
//        System.out.println("Salmon在学习前端课程");
//    }
//
//    //此时若加入学习python课程则该类的实现方法会不断增多，不利于维护
//    public void studyPythonCourse(){
//        System.out.println("Salmon在学习Python课程");
//    }


    public void studyCourse(){
        icourse.studyCourse();
    }
}
