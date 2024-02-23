package com.repasogeneral.tallerpoo;

import java.util.Scanner;

public class TallerPoo {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);
        Integer options = 0;

        do {
            System.out.println("-----------------WELCOME TO MENU---------------------");
            System.out.println("1. exercise");
            System.out.println("2. exercise");
            System.out.println("3. exercise");
            System.out.println("4. exercise");
            System.out.println("5. exercise");
            System.out.println("6. exercise");
            System.out.println("7. exercise");
            System.out.println("8. exercise");
            System.out.println("9. exercise");
            System.out.println("10. exercise");
            System.out.println("11. exercise");
            System.out.println("12. exit");
            System.out.println("");

            System.out.println("Enter the value that you select");
            options = scan.nextInt();
            bindcases(options);
        } while (options != 12);
    }

    public static void bindcases(Integer options) {
        Exercises exercises = new Exercises();

        switch (options) {
            case 1:
                exercises.first();
                break;
            case 2:
                exercises.second();
                break;
            case 3:
                exercises.third();
                break;
            case 4:
                exercises.fourth();
                break;
            case 5:
                exercises.fifth();
                break;
            case 6:
                exercises.sixth();
                break;
            case 7:
                exercises.seventh();
                break;
            case 8:
                exercises.eighth();
                break;
            case 9:
                exercises.ninth();
                break;
            case 10:
                exercises.tenth();
                break;
            case 11:
                exercises.eleventh();
                break;
            case 12:
                System.out.println("Thanks for used this App");
                break;
            default:
                throw new AssertionError();
        }
    }

}
