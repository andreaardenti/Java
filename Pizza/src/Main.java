public class Main {

    public static void main(String[] args) {
        Pizza p1 = new Pizza("margherita");

//        boolean s1 = p1.setCottura(true);
        boolean s2 = p1.isCottura();
        String s3 = p1.toString();

        System.out.println("Nome pizza: " + p1 + " " + s2);

        Oven r = new Oven();
//        r.insertPizza("s1");

        System.out.println(r);
    }
}
