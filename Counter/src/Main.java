public class Main {
    public static void main(String[] args) {
        //definisco le due variabili riferimento per c1 e c2
        Counter c1, c2;
        //istanzio due differenti oggetti di Counter e ne salvo il riferimento nelle variabili c1 e c2
        c1=new Counter();
        c2=new Counter();
        //incremento tre volte il contatore c1
        c1.inc();
        c1.inc();
        c1.inc();
        //stampo il contenuto dei due contatori
        System.out.println("c1: "+c1.getValue());
        System.out.println("c2: "+c2.getValue());
        //incremento c2 e resetto c1
        c2.inc();
        c1.reset();
        //stampo il contenuto dei due contatori
        System.out.println("c1: "+c1.getValue());
        System.out.println("c2: "+c2.getValue());
        //resetto i contatori
        c1.reset();
        c2.reset();
        //verifico se i due contatori sono uguali
        System.out.println("c1==c2 (riferimenti): "+(c1==c2));
        System.out.println("Counter.equals(c1,c2): "+Counter.equals(c1,c2));

    }
}
