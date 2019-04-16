/**
 * 33. Write a Java program and compute the sum of the digits of an integer. Go to the editor
 * Input Data:
 * Input an integer: 25
 * Expected Output
 *
 * The sum of the digits is: 7
 */

import java.util.Scanner;

public class Exercise33 {

    public static void main(String[] args) {
        System.out.print("Inserisci il numero da sommare: ");
        Scanner in = new Scanner(System.in);
        int toSplit = in.nextInt();
        int result = 0;

        while (toSplit > 0 && toSplit != 0) {
            result += toSplit % 10;
            toSplit /= 10;
        }
        System.out.println(result);
    }
}
