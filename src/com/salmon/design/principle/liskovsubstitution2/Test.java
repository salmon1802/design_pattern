package com.salmon.design.principle.liskovsubstitution2;

/**
 * @date 2021-6-14 - 00:43
 * Created by Salmon
 */
public class Test {

    public static void size(Rectangle rectangle) {
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle.getWidth());
    }


    public static void main(String[] args) {
        //这里使用rectangle可以跑
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(7.7);
        rectangle.setWidth(8.8);
        size(rectangle);

        //但是如果我们把输入size方法的对象换为rectangle的子类square
        Square square = new Square();
        square.setHeight(7.7);
        square.setWidth(8.8);
        size(square);
        //我们可以看到输出的结果不正确，正方形怎么会高和宽不一致呢，这就不符合里氏替换原则



    }


}
