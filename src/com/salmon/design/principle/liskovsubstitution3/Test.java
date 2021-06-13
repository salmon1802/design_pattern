package com.salmon.design.principle.liskovsubstitution3;

import com.salmon.design.principle.liskovsubstitution3.Rectangle;
import com.salmon.design.principle.liskovsubstitution3.Square;

/**
 * @date 2021-6-14 - 00:43
 * Created by Salmon
 */
public class Test {

    public static void size(Rectangle rectangle) {
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());
    }

    public static void Squaresize(Square square) {
        System.out.println(square.getHeight());
        System.out.println(square.getLength());
        System.out.println(square.getWidth());
    }


    public static void main(String[] args) {
        //这里使用rectangle可以跑
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(7.7);
        rectangle.setWidth(8.8);
        size(rectangle);

//        //这里我们可以看到，我们再把rectangle换为square程序报错
//        Square square1 = new Square();
//        square1.setHeight(7.7);
//        square1.setWidth(8.8);
//        size(square1);
//
//        //单纯的调用原有size方法也会报错
//        Square square2 = new Square();
//        square2.setLength(5);
//        size(square2);

        //成功
        Square square3 = new Square();
        square3.setLength(5);
        Squaresize(square3);


    }


}
