import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long n1, n2, somma, passi, i;
        Scanner input = new Scanner(System.in);

        n1=0;
        n2=1;
        somma=0;

        do {
            System.out.print("Quanti passaggi vuoi fare?");
            passi = input.nextInt();
        } while (passi<2);

        System.out.print("0, 1, ");

        for (i=0; i<(passi-2); i++) {
            somma = n1+n2;
            System.out.print(somma + ", ");
            n1 = n2;
            n2= somma;

        }


    }
}
