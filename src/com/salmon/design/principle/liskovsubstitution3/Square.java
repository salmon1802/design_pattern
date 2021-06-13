package com.salmon.design.principle.liskovsubstitution3;

/**
 * @date 2021-6-14 - 00:57
 * Created by Salmon
 */
public class Square implements Quadrangle {
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getWidth() {
        return length;
    }

    @Override
    public double getHeight() {
        return length;
    }
}
