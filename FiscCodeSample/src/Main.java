import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Calendar date = new GregorianCalendar(1972, 1, 23);
        User user = new User("Andrea", "arDeNti", date, date);
        System.out.println(user.getFiscalCode());
    }
}
