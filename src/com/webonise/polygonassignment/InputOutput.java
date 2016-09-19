package com.webonise.polygonassignment;

import java.util.Scanner;

public class InputOutput {
    private int lengthOfSide;
    private int numberOfSide;


    void calculatePerimeter(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of sides for calculating Perimeter");
        numberOfSide = reader.nextInt();
        if(numberOfSide < 3 || numberOfSide > 10 )
            return;
        System.out.println("Enter the length of each side");
        lengthOfSide= reader.nextInt();
        Calculator calculatePolygon = new Polygon(lengthOfSide,numberOfSide);//TypeCompatibility
        calculatePolygon.getPerimeter();
    }


    void calculateInteriorAngles(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of sides for calculating sum of Interior Angles");
        lengthOfSide = reader.nextInt();
        Calculator calculatePolygon = new Polygon(lengthOfSide);//TypeCompatibility
        calculatePolygon.sumOfInteriorAngles();
    }


}
