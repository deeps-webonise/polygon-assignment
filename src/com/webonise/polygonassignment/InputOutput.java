package com.webonise.polygonassignment;

import java.util.Scanner;

public class InputOutput {
    private int lengthOfSide;
    private int numberOfSide;


    void calculatePerimeter(){
        System.out.println("Enter the number of sides for calculating Perimeter");
        Scanner reader = new Scanner(System.in);
        lengthOfSide = reader.nextInt();
        System.out.println("Enter the length of each side");
        numberOfSide = reader.nextInt();
        Calculator calculatePolygon = new Polygon(lengthOfSide,numberOfSide);//TypeCompatibility
        calculatePolygon.getPerimeter();
    }


    void calculateInteriorAngles(){
        System.out.println("Enter the number of sides for calculating sum of Interior Angles");
        Scanner reader = new Scanner(System.in);
        lengthOfSide = reader.nextInt();
        Calculator calculatePolygon = new Polygon(lengthOfSide);//TypeCompatibility
        calculatePolygon.sumOfInteriorAngles();
    }


}
