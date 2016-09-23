package com.webonise.polygonassignment;

public class SumOfInternalAnglesCalculator extends Polygon {
    private static final int VALUE = 180;

    SumOfInternalAnglesCalculator(int numberOfSides) {
        super(numberOfSides);
    }

    @Override
    void calculateResultAndPrint() {
        System.out.println((VALUE * (noOfSides - 2)));
    }
}
