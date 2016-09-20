package com.webonise.polygonassignment;

public class PerimeterCalculator extends Polygon {

    PerimeterCalculator(int numberOfSides, float lengthOfSides) {
        super(numberOfSides, lengthOfSides);
    }

    @Override
    void CalculateResultAndPrint() {
        System.out.println(noOfSides * lengthOfSides);
    }
}
