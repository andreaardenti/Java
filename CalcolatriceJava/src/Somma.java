import java.util.Scanner;

public class Somma {

    private int a, b, risultato;

    Scanner in = new Scanner(System.in);

    public void simpleMessage(String name){
        System.out.println("Questo è un messaggio creato dalla classe 'Somma'\nCiao " + name);
    }

    public int somma() {
//        System.out.print("Inserisci il primo valore: ");
//        a = in.nextInt();
//        System.out.print("Inserisci il secondo valore: ");
//        b = in.nextInt();
//        risultato = a+b;
//        System.out.print("Risultato: " + risultato);
        return a+b;
    }

}
