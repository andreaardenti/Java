public class Main {

    public static void main(String[] args) {

        CartesianPlan c = new CartesianPlan(10);
        //c.shift(10,20);
        System.out.println(c.getNear());
        c.sort();

    }
}
