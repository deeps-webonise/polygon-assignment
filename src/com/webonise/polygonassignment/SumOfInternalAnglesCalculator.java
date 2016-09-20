package com.webonise.polygonassignment;

public class SumOfInternalAnglesCalculator extends Polygon {

    SumOfInternalAnglesCalculator(int numberOfSides) {
        super(numberOfSides);
    }

    @Override
    void CalculateResultAndPrint() {
        System.out.println((180 * (noOfSides - 2)));
    }
}
