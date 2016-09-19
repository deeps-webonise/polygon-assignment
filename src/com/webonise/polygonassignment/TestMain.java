package com.webonise.polygonassignment;

import java.util.Scanner;

public class TestMain {
    public static void main(String args[]) {
        InputOutput obj = new InputOutput();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter \n1)Perimeter \n2)Sum of interior angles");
        int choice=scanner.nextInt();
        if(choice==1)
            obj.calculatePerimeter();
        else if(choice ==2)
            obj.calculateInteriorAngles();


    }
}

