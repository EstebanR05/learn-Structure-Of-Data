package com.calculator.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        //objects
        Scanner scan = new Scanner(System.in);
        Calc calculator = new Calc();

        //get data using console
        System.out.println("Enter the first value");
        float valueOne = scan.nextInt();

        System.out.println("Enter the Second value");
        float valueTwo = scan.nextInt();

        //menu
        Integer menu = 0;

        do {
            System.out.println("-------------------MENU-----------------------");
            System.out.println("1. Sum the values");
            System.out.println("2. substract the values");
            System.out.println("3. multiplication the values");
            System.out.println("4. divide the values");
            System.out.println("5. Exit");
            System.out.println("");

            System.out.println("Enter your option");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    calculator.sum(valueOne, valueTwo);
                    break;
                case 2:
                    calculator.substract(valueOne, valueTwo);
                    break;
                case 3:
                    calculator.multiplication(valueOne, valueTwo);
                    break;
                case 4:
                    calculator.divide(valueOne, valueTwo);
                    break;
                case 5:
                    System.out.println("Thanks for used this calculator");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (menu != 5);
    }

}
