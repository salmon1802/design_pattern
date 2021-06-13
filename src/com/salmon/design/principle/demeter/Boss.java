package com.salmon.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2021-6-13 - 23:28
 * Created by Salmon
 */
public class Boss {
//    //这里就不符合demeter原则，Boss没有必要知道Course类
//    public void commandCheckNumber(TeamLeader teamLeader){
//       /*这里*/ List<Course> courseList = new ArrayList<>();
//        for(int i = 0; i < 20;i++){
//            courseList.add(new Course());
//        }
//        teamLeader.checkNumberOfCourse(courseList);
//    }


    //此时boss不知道course类，只需要下指令即可
        public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourse();
    }
}
