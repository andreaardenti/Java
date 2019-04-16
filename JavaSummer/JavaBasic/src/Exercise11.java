/**
 * 11. Write a Java program to print the area and perimeter of a circle. Go to the editor
 * Test Data:
 * Radius = 7.5
 * Expected Output
 * Perimeter is = 47.12388980384689
 * Area is = 176.71458676442586
 */


public class Exercise11 {

    private static final double radius = 7.5;
    private double circleArea;

    public double circleArea() {

        System.out.println("Calcoliamo il perimetro e l'area del cerchio...");
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimetro: " + perimeter);
        System.out.println("Area: " + area);
        return circleArea;
    }

}
