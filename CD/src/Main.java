public class Main {

    public static void main(String[] args) {
        String[] x = {"A Momentary laps of Reason", "Comfortably Numbs", "Sorrow"};  // popolo la variabile x che è un array di stringhe
        CD cd1 = new CD(x);  // creo un nuovo cd
        System.out.println(cd1);  // stampo il contenuto dell'array cd1

        Reader r = new Reader();
        r.insertCD(cd1);

        System.out.println(r.play(2));
        System.out.println("Stampo il cd corrente: " + r.currentCD());

        r.removeCD();

        System.out.println("Stampo il cd corrente: " + r.currentCD());
    }
}
