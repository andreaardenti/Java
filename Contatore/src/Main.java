public class Main {

    public static void main(String[] args) {

        // crea un nuova variabile
        Counter c1, c2;

        // istanzio c1 e c2 usando la classe Counter
        c1 = new Counter();
        c2 = new Counter();

        //incrementa c1 tre volte
        c1.inc();
        c1.inc();
        c1.inc();

        // stampo i contenuti di c1
        System.out.println("C1: " + c1.getValue());

        // incremento c2 e resetto c1
        c2.inc();
        c1.reset();

        // stampo nuovamente i contenuti di c2 e c1
        System.out.println("C2: " + c2.getValue());
        System.out.println("C1: " + c1.getValue());

        c1.inc();
        c1.inc();

        System.out.println("Somma di c1 e c2: " + (c1.getValue() + c2.getValue()));

        System.out.println(c1);
    }
}