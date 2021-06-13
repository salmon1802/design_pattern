package com.salmon.design.principle.singleresponsibility;

/**
 * @date 2021-6-13 - 22:41
 * Created by Salmon
 */
public class Test {
    //v1
//    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");//这里不对，鸵鸟不能飞，所以应该改变
//
//    }

    //v2
//    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");//ok了
//
//    }

//      v3
//    public static void main(String[] args) {
//        FlyBird flyBird = new FlyBird(); //飞鸟负责会飞的鸟
//        WalkBird walkBird = new WalkBird();//走兽负责会走的鸟
//        flyBird.mainMoveMode("大雁");
//        walkBird.mainMoveMode("鸵鸟");
//    }


}
