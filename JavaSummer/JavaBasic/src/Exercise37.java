/**
 * 37. Write a Java program to reverse a string. Go to the editor
 * Input Data:
 * Input a string: The quick brown fox
 * Expected Output
 *
 * Reverse string: xof nworb kciuq ehT
 */

import java.util.Scanner;

public class Exercise37 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci la stringa da 'reversare': ");
        String toReverse = in.nextLine();
        String reverse = new StringBuffer(toReverse).reverse().toString();
        System.out.println(reverse);
    }
}
