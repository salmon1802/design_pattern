package com.salmon.design.principle.dependenceiversion;

import com.salmon.design.principle.openclose.ICourse;

/**
 * @date 2021-6-13 - 21:41
 * Created by Salmon
 */
public class FECourse implements Icourse {
    @Override
    public void studyCourse() {
        System.out.println("salmon正在学习FECourse");
    }
}