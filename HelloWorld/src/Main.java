public class Main {

    public static void main(String[] args) {

        int x = 3, y = 4;
        int z = x + y;

        Counter c1;
        c1=new Counter();

        c1.inc();

        System.out.println("Hello World!");
        System.out.println(z);

        //oppure si poteva scrivere

        System.out.println ("Hello world" + z);  // così concatena una scritta ed una variabile, e la stampa

        System.out.println("Questo è il valore di c1: " + c1.getValue());

    }
}
