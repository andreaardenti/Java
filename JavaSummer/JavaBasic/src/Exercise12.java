/**
 * 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
import java.util.Scanner;

public class Exercise12 {

    public static Scanner in = new Scanner(System.in);

    int num1 = in.nextInt();
    int num2 = in.nextInt();
    int num3 = in.nextInt();

    public int average() {
        int average = (num1+num2+num3)/3;
        return average;
    }
}
