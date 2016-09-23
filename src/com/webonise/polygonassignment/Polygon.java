package com.webonise.polygonassignment;

public abstract class Polygon {
    protected int noOfSides;
    protected double lengthOfSides;

    Polygon(int noOfSides) {
        this.noOfSides = noOfSides;
    }

    Polygon(int noOfSides, double lengthOfSides) {
        this.noOfSides = noOfSides;
        this.lengthOfSides = lengthOfSides;
    }

    abstract void calculateResultAndPrint();
}