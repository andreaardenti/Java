import java.util.Scanner;

/**
 * 34. Write a Java program to compute the area of a hexagon. Go to the editor
 * Area of a hexagon = (6 * s^2)/(4*tan(π/6))
 * where s is the length of a side
 * Input Data:
 * Input the length of a side of the hexagon: 6
 * Expected Output
 *
 * The area of the hexagon is: 93.53074360871938
 *
 * 35. Write a Java program to compute the area of a polygon. Go to the editor
 * Area of a polygon = (n*s^2)/(4*tan(π/n))
 * where n is n-sided polygon and s is the length of a side
 * Input Data:
 * Input the number of sides on the polygon: 7
 * Input the length of one of the sides: 6
 * Expected Output
 *
 * The area is: 130.82084798405722
 */

public class Exercise34 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Inserisci il numero dei lati: ");
        int sideNumber = in.nextInt();
        System.out.print("Inserisci la lunghezza del lato: ");
        int sideLenght = in.nextInt();

        double resultExagon = (6*(sideLenght*sideLenght))/(4*Math.tan(Math.PI/6));
        double resultPoligon = (sideNumber*(sideLenght*sideLenght))/(4*Math.tan(Math.PI/sideNumber));
        System.out.println("L'area del poligono è: " + resultExagon);
        System.out.println("L'area del poligono è: " + resultPoligon);
    }
}
