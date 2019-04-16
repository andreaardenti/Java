import java.util.Scanner;

public class Exercise05 {

    public int multiply() {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Inserisci il primo numero: ");
        int num1 = userInput.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int num2 = userInput.nextInt();

        int multiply = num1 * num2;
        return  multiply;
    }
}
