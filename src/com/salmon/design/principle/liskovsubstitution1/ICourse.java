package com.salmon.design.principle.liskovsubstitution1;

/**
 * @date 2021-6-13 - 17:54
 * Created by Salmon
 */
public interface ICourse {
    String getName();
    double getPrice();
    Integer getId();

    //如果增加打折方法,不要在接口声明新增方法
    //double getDiscountPrice();
}
