package com.webonise.polygonassignment;

public class Polygon implements Calculator {
    private final int noOfSides;
    private final double lengthOfSides;

    //Constructor Overloading
    public Polygon(){
        this.lengthOfSides=0;
        this.noOfSides=0;
    }

    public Polygon(int noOfSides){
        this.noOfSides=noOfSides;
        this.lengthOfSides=0;
    }

    public Polygon(int noOfSides, int lengthOfSides){
        this.noOfSides=noOfSides;
        this.lengthOfSides=lengthOfSides;
    }

    @Override
    public void getPerimeter() {
        System.out.println(noOfSides*lengthOfSides);
    }

    @Override
    public void sumOfInteriorAngles() {
        System.out.println((noOfSides-2) * 180);


    }
}
