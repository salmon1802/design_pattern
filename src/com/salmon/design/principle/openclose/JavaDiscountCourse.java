package com.salmon.design.principle.openclose;

/**
 * @date 2021-6-13 - 18:07
 * Created by Salmon
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice()*0.5;
    }

    public double getOriginPrice(){
        return super.getPrice();
    }

}
