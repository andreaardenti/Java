public class Main {

    public static void main(String[] args) {

        User u = new User("andrea", "ardenti", "1972");

//        u.setName("andrea");
//        u.setSurname("ardenti");
//        u.setDateOfBirth("1972");

        System.out.println(u);

        System.out.println(u.getName() + u.getSurname() + u.getDateOfBirth());

    }
}
