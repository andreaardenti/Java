/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */

import java.util.Scanner;

public class Exercise06 {


    public static Scanner in = new Scanner(System.in);

    int num1 = in.nextInt();
    int num2 = in.nextInt();


    public int sum() {

//        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("Inserisci il primo numero: ");
//        int num1 = userInput.nextInt();
//
//        System.out.println("Inserisci il secondo numero: ");
//        int num2 = userInput.nextInt();

        int add = num1 + num2;
        return  add;
    }

    public int multiply() {

//        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("Inserisci il primo numero: ");
//        int num1 = userInput.nextInt();
//
//        System.out.println("Inserisci il secondo numero: ");
//        int num2 = userInput.nextInt();

        int multiply = num1 * num2;
        return  multiply;
    }

    public int subtract() {

//        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("Inserisci il primo numero: ");
//        int num1 = userInput.nextInt();
//
//        System.out.println("Inserisci il secondo numero: ");
//        int num2 = userInput.nextInt();

        int subtract = num1 - num2;
        return  subtract;
    }

    public int divide() {

//        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("Inserisci il primo numero: ");
//        int num1 = userInput.nextInt();
//
//        System.out.println("Inserisci il secondo numero: ");
//        int num2 = userInput.nextInt();

        int divide = num1 / num2;
        return  divide;
    }

    public int remainder() {

//        Scanner userInput = new Scanner(System.in);
//
//        System.out.println("Inserisci il primo numero: ");
//        int num1 = userInput.nextInt();
//
//        System.out.println("Inserisci il secondo numero: ");
//        int num2 = userInput.nextInt();

        int remainder = num1 % num2;
        return  remainder;
    }

}