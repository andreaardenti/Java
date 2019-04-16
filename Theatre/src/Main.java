public class Main {

    public static void main(String[] args) {

        User u = new User("Andrea", "Ardenti", 46);

        System.out.println(u.getAge());

        u.setAge(32);
        System.out.println(u.getAge());

        Theather t1 = new Theather(10,20);
        Theather t2 = new Theather(20,10);

        t1.assignPlace(u, 1);
        t2.assignPlace(u, 5);

        System.out.println (t1.getArchive());
        System.out.println (t2.getArchive());

        System.out.println ("Profitto " + t2.getProfit());
    }
}
