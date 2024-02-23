package com.repasogeneral.tallerpoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercises {

    public static void first() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String nameUser = scan.nextLine();

        System.out.println("¿How old are you?");
        Integer yearUser = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the value of product: ");
        float valueProduct = scan.nextInt();
        scan.nextLine();

        float valueDiscount = (valueProduct * 30) / 100;
        float discount = valueProduct - valueDiscount;

        if (yearUser >= 71) {
            System.out.println(nameUser + " have discount of " + valueDiscount + ", you pay this: " + discount);
        } else {
            System.out.println("Sorry! " + nameUser + " don't have discount, you pay this: " + valueProduct);
        }
    }

    public static void second() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many do you want Tires?");
        Integer numTires = scan.nextInt();

        if (numTires <= 4) {
            System.out.println("you pay this: " + (numTires * 800000));
        }

        if (numTires >= 5) {
            System.out.println("you pay this: " + (numTires * 700000));
        }
    }

    public static void third() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the firts number: ");
        Integer numOne = scan.nextInt();

        System.out.println("Enter the Second number: ");
        Integer numTwo = scan.nextInt();

        if (numOne == numTwo) {
            System.out.println("The numbers is equals, the result is: " + (numOne * numTwo));
        } else {
            System.out.println("The numbers isn't equals, the result is: " + (numOne - numTwo));
        }
    }

    public static void fourth() {
        Scanner scan = new Scanner(System.in);

        System.out.println("how old are you?");
        Integer year = scan.nextInt();

        System.out.println("Enter your name: ");
        String nameUser = scan.nextLine();

        if (year < 45) {
            System.out.println(nameUser + " are very young!");
        } else {
            System.out.println(nameUser + " are very old!");
        }
    }

    public static void fifth() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String nameUser = scan.nextLine();

        System.out.println("How tall are you?");
        double tall = scan.nextDouble();

        if (tall <= 1.65) {
            System.out.println(nameUser + " are very short!");
        } else {
            System.out.println(nameUser + " are very high!");
        }
    }

    public static void sixth() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the password");
        String password = scan.nextLine();

        if (password.equals("solrac")) {
            System.out.println("Your password is correct");
        } else {
            System.out.println("Your password isn't correct");
        }
    }

    public static void seventh() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the firts number: ");
        Integer numOne = scan.nextInt();

        System.out.println("Enter the Second number: ");
        Integer numTwo = scan.nextInt();

        if (numOne == numTwo) {
            System.out.println("The result is: " + (numOne * numTwo));
        } else if (numOne > numTwo) {
            System.out.println("The result is: " + (numOne - numTwo));
        } else {
            System.out.println("The result is: " + (numOne + numTwo));
        }
    }

    public static void eighth() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String nameUser = scan.nextLine();

        System.out.println("Enter the price of shirts: ");
        double ValueShirts = scan.nextDouble();

        System.out.println("Enter the quantility that you wanna shop: ");
        Integer quantility = scan.nextInt();

        double finalValueProduct = ValueShirts * quantility;

        if (quantility >= 3) {
            double discount = (finalValueProduct * 20) / 100;
            System.out.println(
                    nameUser
                    + " your shirts discount is "
                    + discount + " and the price of pay is "
                    + (finalValueProduct - discount)
            );
        } else {
            double discount = (finalValueProduct * 10) / 100;
            System.out.println(
                    nameUser
                    + " your shirts discount is "
                    + discount + " and the price of pay is "
                    + (finalValueProduct - discount)
            );
        }
    }

    public static void ninth() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter one number random: ");
        Integer randomValue = scan.nextInt();

        System.out.println("Enter the price of product that you wanna shop: ");
        double pricePrduct = scan.nextInt();

        if (randomValue >= 74) {
            double discount = (pricePrduct * 20) / 100;
            System.out.println(
                    " your discount is "
                    + discount + " and the price of pay is "
                    + (pricePrduct - discount)
            );
        } else {
            double discount = (pricePrduct * 15) / 100;
            System.out.println(
                    " your discount is "
                    + discount + " and the price of pay is "
                    + (pricePrduct - discount)
            );
        }
    }

    public static void tenth() {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("geeen");
        colors.add("yellow");
        colors.add("white");

        int randomValue = (int) (Math.random() * 5);

        System.out.println("Your random value is " + randomValue + " and the color is: " + colors.get(randomValue));
        System.out.println("");

        User user = getUser(randomValue, colors.get(randomValue));
        validatedValues(user);
    }

    public static User getUser(int randomvalue, String color) {
        Scanner scan = new Scanner(System.in);
        User user = new User();
        user.setRandomValue(randomvalue);
        user.setColor(color);

        System.out.println("Enter the price of product that you wanna shop: ");
        user.setPrice(scan.nextDouble());
        scan.nextLine();

        System.out.println("enter the day that you shop");
        user.setDate(scan.nextLine());

        System.out.println("enter the city");
        user.setCity(scan.nextLine());

        System.out.println("Enter your name: ");
        user.setNameUser(scan.nextLine());

        return user;
    }

    public static void validatedValues(User user) {
        double discount = 0;

        if (user.color.equals("yellow")) {
            discount = user.price * 0.20;
        } else if (user.color.equals("green")) {
            discount = user.price * 0.10;
        } else if (user.color.equals("red")) {
            discount = user.price;
        } else if (user.color.equals("blue")) {
            discount = user.price * 0.50;
        }

        user.setDiscount(discount);
        impressTheFacture(user);
    }

    public static void impressTheFacture(User user) {
        System.out.println(
                "----------------Facture-----------------"
                + "\n" + user.nameUser
                + "\n your discount is: " + user.discount
                + "\n and the price of pay is: " + (user.price - user.discount)
                + "\n in the day: " + user.date
                + "\n in the city: " + user.city
        );
    }

    public static void eleventh() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many computers do you want shop?: ");
        Integer numberCumputers = scan.nextInt();

        System.out.println("Enter the price of product that you wanna shop: ");
        double price = scan.nextInt();

        //final price
        double pricePrduct = price * numberCumputers;

        if (numberCumputers >= 5) {
            double discount = (pricePrduct * 20) / 100;
            System.out.println(
                    " your discount is "
                    + discount + " and the price of pay is "
                    + (pricePrduct - discount)
            );
        } else {
            double discount = (pricePrduct * 10) / 100;
            System.out.println(
                    " your discount is "
                    + discount + " and the price of pay is "
                    + (pricePrduct - discount)
            );
        }
    }
}
