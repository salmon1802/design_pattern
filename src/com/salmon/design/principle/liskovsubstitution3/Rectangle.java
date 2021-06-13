package com.salmon.design.principle.liskovsubstitution3;

/**
 * @date 2021-6-14 - 00:56
 * Created by Salmon
 */
public class Rectangle implements Quadrangle{

    private double height;
    private double width;

    @Override
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
