import java.util.Scanner;

public class Divisione {

    private int a, b, risultato;

    Scanner in = new Scanner(System.in);

    public int divisione() {
        System.out.print("Inserisci il primo valore: ");
        a = in.nextInt();
        System.out.print("Inserisci il secondo valore: ");
        b = in.nextInt();
        risultato = a/b;
        System.out.print("Risultato: " + risultato);
        return a/b;
    }

}