/**
 * 17. Write a Java program to add two binary numbers.
 */

import java.util.Scanner;

public class Exercise17 {

    public static Scanner in = new Scanner(System.in);


    public static String addBinary() {
        System.out.print("Inserisci il primo numero: ");
        int num1 = in.nextInt();
        System.out.print("\nInserisci il secondo numero: ");
        int num2 = in.nextInt();

        int number0 = Integer.parseInt(String.valueOf(num1), 2);
        int number1 = Integer.parseInt(String.valueOf(num2), 2);

        int sum = number0 + number1;
        return Integer.toBinaryString(sum);
    }

    public static String multiplyBinary() {                             //questa parte è la richiesta dell'esercizio 18
        System.out.print("Inserisci il primo numero: ");
        int num1 = in.nextInt();
        System.out.print("\nInserisci il secondo numero: ");
        int num2 = in.nextInt();

        int number0 = Integer.parseInt(String.valueOf(num1), 2);
        int number1 = Integer.parseInt(String.valueOf(num2), 2);

        int sum = number0 * number1;
        return Integer.toBinaryString(sum);
    }

    public static String convertDecimalToBinary() {                     //questa parte è la richiesta dell'esercizio 19
        System.out.print("\nInserisci il numero da convertire in binario: ");
        int num3 = in.nextInt();
        String num3c = Integer.toString(num3,2);

        return String.valueOf(num3c);

    }

    public static String convertDecimalToHex() {                        //questa parte è la richiesta dell'esercizio 20
        System.out.print("\nInserisci il numero da convertire in esadecimale: ");
        int num3 = in.nextInt();
        String num3c = Integer.toString(num3,16);

        return String.valueOf(num3c);

    }

    public static String convertDecimalToOct() {                        //questa parte è la richiesta dell'esercizio 20
        System.out.print("\nInserisci il numero da convertire in ottale: ");
        int num3 = in.nextInt();
        String num3c = Integer.toString(num3,8);

        return String.valueOf(num3c);

    }

}
