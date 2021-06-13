package com.salmon.design.principle.singleresponsibility;

/**
 * @date 2021-6-13 - 22:40
 * Created by Salmon
 */
public class Bird {

//      v1:
//    public void mainMoveMode(String birdName) {
//            System.out.println(birdName + "用翅膀飞");
//    }

    public void mainMoveMode(String birdName) {
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }


}
