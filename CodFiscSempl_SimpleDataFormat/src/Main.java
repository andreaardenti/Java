public class Main {

    public static void main(String[] args) {

        User u = new User("andrea", "ardenti", "1972");

//        Calendar data = Calendar.getInstance();
//        SimpleDateFormat a = new SimpleDateFormat("yy");
//        System.out.println(a.format(data.getTime()));
//        System.out.println(u.getName() + u.getSurname() + u.getDateOfBirth() + a.format(data.getTime()));

        System.out.println(u);
        System.out.println(" ");
        System.out.println (u.getPrintCodFisc());

    }
}