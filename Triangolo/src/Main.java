import java.util.*;

public class Main {

    public static void main(String[] args) {

        int latoA=0, latoB=0, latoC=0;
        int userInput=0;
        int i, j;

        Scanner in;
        in = new Scanner(System.in);

//************** leggo da tastiera l'input dell'utente *****************

        System.out.print("Inserisci il latoA: ");
        latoA = in.nextInt();

        System.out.print("Inserisci il latoB: ");
        latoB = in.nextInt();

        System.out.print("Inserisci il latoC: ");
        latoC = in.nextInt();

        if ((latoA==latoB) && (latoB==latoC))
            System.out.println("I dati inseriti corrispondono ad un triangolo equilatero");
        else
            if ((latoA==latoB) || (latoB==latoC) || (latoC==latoA))
                System.out.println("I dati inseriti corrispondono ad un triangolo isoscele");
            else {
                System.out.println("I dati inseriti corrispondono ad un triangolo scaleno");
            }

        while (userInput == 0) {
            System.out.print("1- Stampa qualcosa\n2- Tabellina\n0-Ti salutai...!\n");

            in = new Scanner(System.in);
            userInput = in.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Benvenuto al primo corso JAVA!");
                break;

                case 2:
                    System.out.println("Tabellina");
                    {
                        for (i=1; i<=10; i++){
                            for (j = 1; j <= 10; j++)
                            System.out.print(i+"x"+j+"="+i*j+"\t   ");
                        System.out.println();
                    }
                break;
                    }

                default:
                    System.out.println("Bye");
                break;
            }
        }
    }
}