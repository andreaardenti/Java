public class Main {

    public static void main(String[] args) {

        Punto p1;
        Punto p2;

        p1 = new Punto();
        p2 = new Punto();

        p1.setX(900);
        p1.setY(800);

        p2.setX(6);
        p2.setY(5);


        System.out.println("X di p1: " + p1.getX());
        System.out.println("Y di p1: " + p1.getY());
        System.out.println();
        System.out.println("X di p2: " + p2.getX());
        System.out.println("Y di p2: " + p2.getY());
    }
}
