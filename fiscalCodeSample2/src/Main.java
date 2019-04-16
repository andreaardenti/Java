import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Calendar date3 = new GregorianCalendar(1972, 0, 23);
        User user3 = new User("Ardenti", "Andrea Roberto", date3, "f");
        System.out.println(user3.generateCFName());

    }
}