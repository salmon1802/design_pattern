package com.salmon.design.principle.liskovsubstitution1;

/**
 * @date 2021-6-13 - 17:56
 * Created by Salmon
 */
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }
}
