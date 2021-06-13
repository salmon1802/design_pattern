package com.salmon.design.principle.openclose;

/**
 * @date 2021-6-13 - 18:00
 * Created by Salmon
 */
public class Test {
    public static void main(String[] args) {

//        ICourse javaCourse = new JavaCourse(1, "design", 100.0);
//        System.out.println(javaCourse.getName());
//        System.out.println(javaCourse.getId());
//        System.out.println(javaCourse.getPrice());

        //增加了方法
        ICourse iCourse = new JavaDiscountCourse(1, "design", 100.0);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse)iCourse;
        System.out.println(javaCourse.getName());
        System.out.println(javaCourse.getId());
//        System.out.println(javaCourse.getPrice());

        System.out.println(javaCourse.getOriginPrice());
        System.out.println(javaCourse.getPrice());
    }
}
