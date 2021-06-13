package com.salmon.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2021-6-13 - 23:28
 * Created by Salmon
 */
public class TeamLeader {
//    public void checkNumberOfCourse(List<Course> courseList){
//        System.out.println("课程数量为"+courseList.size());
//    }

    public void checkNumberOfCourse(){
        List<Course> courseList = new ArrayList<>();
        for(int i = 0; i < 20;i++){
            courseList.add(new Course());
        }
        System.out.println("课程数量为"+courseList.size());
    }
}
