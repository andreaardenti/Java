import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Teatro c1 = new Teatro();

        Utente u = new Utente();
        Bambino bambino = new Bambino();
        Anziano anziano = new Anziano();
        Adulto adulto = new Adulto();

        //Adulto[] adulti = new Adulto[100];   --- dichiarazione di array

        Scanner in;
        in = new Scanner(System.in);

        System.out.println("Inserisci il nome dell'utente: ");
        u.setName(in.nextLine());
        //System.out.println("Nome: " + u.getName());
        System.out.println("Inserisci il cognome dell'utente: ");
        u.setSurname(in.nextLine());
        //System.out.println("Cognome: " + u.getSurname());
        System.out.println("Inserisci la mail dell'utente: ");
        u.seteMail(in.nextLine());
        //System.out.println("eMail: " + u.geteMail());
        System.out.println("Inserisci la tua età: ");
        u.setEta(in.nextInt());
        //System.out.println("Età: " + u.getEta());

        //c1.addUtente(u);


        if (u.getEta() < 5){
        System.out.println("Costo dell'abbonamento: " + bambino.free() + "euro ");
    }   else if (u.getEta() > 5 && u.getEta() <= 10){
            System.out.println("Costo dell'abbonamento: " + bambino.detrazione() + "euro ");
        }else if (u.getEta() > 65) {
            System.out.println("Costo dell'abbonamento: " + anziano.detrazione() + "euro ");
        }else if (u.getEta() > 10 && u.getEta() <= 65) {
            System.out.println("Costo dell'abbonamento: " + adulto.detrazione() + "euro ");
        }

        System.out.println("\n\n********** Riepilogo dati inseriti **********\n" + "Nome: " + u.getName() + "\n" + "Cognome: " + u.getSurname() + "\n" + "eMail: " + u.geteMail() + "\n" + "Età: " + u.getEta());
    }
}
