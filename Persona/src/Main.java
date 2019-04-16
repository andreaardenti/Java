public class Main {

    public static void main(String[] args) {

        Person p;
        p = new Person();

        p.setName("Andrea");
        System.out.println("Nome " + p.getName());

        p.setSurname("Ardenti");
        System.out.println("Cognome " + p.getSurname());

        p.setAddress("Indirizzo ");
        System.out.println("" + p.getAddress());

        p.setAge(46);
        System.out.println("" + p.getAge());
    }

}
