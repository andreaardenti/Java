package itsjobs.programming;
import itsjobs.programming.shape.*;

public class Main {

    public static void main(String[] args) {

        Shape s1=new Shape();
        Shape s2=new Shape(5, 7);

        Shape s3=new Rectangle();
        Shape s4=new Rectangle(5, 7);

        //Completamento esercizio
        Shape s5=new Triangle();
        Shape s6=new Triangle(5, 5);

        //System.out.println(s1);
        System.out.println(s2);
        //System.out.println(s3);
        System.out.println(s4);
        //System.out.println(s5);
        System.out.println(s6);
    }
}
