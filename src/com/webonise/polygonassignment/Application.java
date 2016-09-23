package com.webonise.polygonassignment;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {
    Logger logger = Logger.getLogger(Application.class.getName());

    private int lengthOfSide;
    private int numberOfSide;
    private static final int MIN_SIDES = 3;
    private static final int MAX_SIDES = 10;

    void getUserChoiceAndPrint() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        logger.log(Level.INFO, "Enter \n1)Perimeter \n2)Sum of interior angles");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                calculatePerimeter();
                break;
            case 2:
                calculateInteriorAngles();
                break;
            default:
                System.out.println("Wrong choice.\nExiting...");
                return;
        }
    }

    private void calculatePerimeter() {
        Scanner reader = new Scanner(System.in);
        logger.log(Level.INFO, "Enter the number of sides for calculating Perimeter");
        numberOfSide = reader.nextInt();
        if (numberOfSide < MIN_SIDES || numberOfSide > MAX_SIDES) {
            System.out.println("Wrong arguments passed Please enter between 3 and 10\nExiting...");
            return;
        }
        logger.log(Level.INFO, "Enter the length of each side");
        lengthOfSide = reader.nextInt();
        Polygon calculatePolygon = new PerimeterCalculator(lengthOfSide, numberOfSide);//TypeCompatibility
        calculatePolygon.calculateResultAndPrint();
    }


    private void calculateInteriorAngles() {
        Scanner reader = new Scanner(System.in);
        logger.log(Level.INFO, "Enter the number of sides for calculating sum of Interior Angles");
        numberOfSide = reader.nextInt();
        if (numberOfSide < MIN_SIDES || numberOfSide > MAX_SIDES) {
            System.out.println("Wrong arguments passed Please enter between 3 and 10\nExiting...");
            return;

        }

        Polygon calculatePolygon = new SumOfInternalAnglesCalculator(numberOfSide);//TypeCompatibility
        calculatePolygon.calculateResultAndPrint();
    }
}