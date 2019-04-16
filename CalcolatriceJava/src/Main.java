import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputName = new Scanner (System.in);
        Somma msgObject = new Somma();
        System.out.println("Inserisci il tuo nome: ");
        String name = inputName.nextLine();
        msgObject.simpleMessage(name);

        System.out.print("Inserisci un input da tastiera: ");
        Scanner a = new Scanner(System.in);
        System.out.println("Hai inserito: " + a.nextLine());

        int select = 0;
        int x, y, risultato;

        do {
            System.out.print("\n1- Somma\n2- Sottrazione\n3- Moltiplicazione\n4- Divisione\n5- Uscita dal programma\n");
            Scanner in;
            in = new Scanner(System.in);
            select = in.nextInt();

            switch (select) {
                case 1: //ho trasferito l'interazione con l'utente sul main, e lasciato la logica nella classe Somma
                        System.out.print("Inserisci il primo valore: ");
                        x = in.nextInt();
                        System.out.print("Inserisci il secondo valore: ");
                        y = in.nextInt();
                        risultato = x+y;
                        System.out.print("Risultato: " + risultato);
                        Somma operazione = new Somma();
                        operazione.somma();
                        break;

                case 2: Sottrazione sott = new Sottrazione();
                        sott.sottrazione();
                        break;

                case 3: Moltiplicazione molt = new Moltiplicazione();
                        molt.moltiplicazione();
                        break;

                case 4: Divisione div = new Divisione();
                        div.divisione();
                        break;

                default: return;

            }
        }while(select != 0);





    }
}
