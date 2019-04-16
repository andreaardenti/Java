/**
 * 15. Write a Java program to swap two variables.
 */
import java.lang.*;



public class Exercise15 {

    private int temp, a = 15, b=27;

    public int swap() {
        System.out.print("Valore della variabile temp: " + temp);
        System.out.print("\nValore della variabile a: " + a);
        System.out.print("\nValore della variabile b: " + b);
        temp = a;
        System.out.print("\nValore della variabile temp dopo assegnazione di temp = a: " + temp);
        a = b;
        System.out.print("\nValore della variabile a: " + a);
        b = temp;
        System.out.print("\nValore della variabile b: " + b + "\n\n");



        return 0;
    }

}
