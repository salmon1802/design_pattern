package com.salmon.design.principle.liskovsubstitution1;

/**
 * @date 2021-6-13 - 18:07
 * Created by Salmon
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    //这里不符合里氏替换原则，因为我们覆盖了父类的方法，且修改了原有的逻辑
    @Override
    public double getPrice() {
        return super.getPrice()*0.5;
    }

    //我们应该新建一个方法作为父类的扩展,这样才符合里氏替换原则
    public double getDiscountPrice() {
        return super.getPrice()*0.5;
    }

    public double getOriginPrice(){
        return super.getPrice();
    }

}
