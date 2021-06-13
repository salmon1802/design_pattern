package com.salmon.design.principle.dependenceiversion;

/**
 * @date 2021-6-13 - 21:32
 * Created by Salmon
 */
public class Test {

    //v1
//    public static void main(String[] args) {
//        Salmon salmon = new Salmon();
//        salmon.studyFECourse();
//        salmon.studyJavaCourse();
//        //加入python课程学习，这样即高层一直依赖底层实现
//        salmon.studyPythonCourse();
//    }



    //一下几种方式不再是依赖于单一的salmon类里的方法，而是逐个调用接口Icourse中的方法并注入相应的实现类，
    //    来达到依赖反转的效果
    //v2
//    public static void main(String[] args) {
//        Salmon salmon = new Salmon();
//        salmon.studyCourse(new JavaCourse());
//        salmon.studyCourse(new FECourse());
//        //此时加入python课程
//        salmon.studyCourse(new PythonCourse());
//    }

    //v3 构造器方式
//    public static void main(String[] args) {
//
//        Salmon salmon = new Salmon(new JavaCourse());
//        salmon.studyCourse();
//    }

    //v4 setter方式
    public static void main(String[] args) {
        Salmon salmon =new Salmon();
        salmon.setIcourse(new JavaCourse());
        salmon.studyCourse();

        salmon.setIcourse(new PythonCourse());
        salmon.studyCourse();
    }
}
