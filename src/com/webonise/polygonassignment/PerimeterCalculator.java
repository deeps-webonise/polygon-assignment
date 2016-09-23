package com.webonise.polygonassignment;

public class PerimeterCalculator extends Polygon {

    PerimeterCalculator(int numberOfSides, float lengthOfSides) {
        super(numberOfSides, lengthOfSides);
    }

    @Override
    void calculateResultAndPrint() {
        System.out.println(noOfSides * lengthOfSides);
    }
}
