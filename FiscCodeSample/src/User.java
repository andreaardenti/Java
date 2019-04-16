import java.util.Calendar;

public class User {
    private String name;
    private String surname;
    private Calendar dateOfBirth;
    private Calendar monthString;

    public User(String param1, String param2, Calendar date, Calendar monthString) {
        this.name = param1;
        this.surname = param2;
        this.dateOfBirth = date;
        this.monthString = monthString;
    }

    public String getFiscalCode() {

        String secondPart = this.name.toUpperCase();
        secondPart = secondPart.replaceAll("[AaEeIiOoUu]", "");
//        System.out.println(firstPart.substring(0,3));

        String firstPart = this.surname.toUpperCase();
        firstPart = firstPart.replaceAll("[AaEeIiOoUu]", "");
//        System.out.println(secondPart.substring(0,3));

        int month = this.dateOfBirth.get(Calendar.MONTH);
        String monthString;
        switch (month) {
            case 1:  monthString = "A";
                break;
            case 2:  monthString = "B";
                break;
            case 3:  monthString = "C";
                break;
            case 4:  monthString = "D";
                break;
            case 5:  monthString = "E";
                break;
            case 6:  monthString = "H";
                break;
            case 7:  monthString = "L";
                break;
            case 8:  monthString = "M";
                break;
            case 9:  monthString = "P";
                break;
            case 10: monthString = "R";
                break;
            case 11: monthString = "S";
                break;
            case 12: monthString = "T";
                break;
            default: monthString = "Invalid month";
                break;
        }
//        System.out.println(monthString);

        int year = this.dateOfBirth.get(Calendar.YEAR);
        int day = this.dateOfBirth.get(Calendar.DAY_OF_MONTH);

        String yearString = String.valueOf(year);
        String dayString = String.valueOf(day);

        return "Ecco il tuo codice fiscale: \n" + firstPart.substring(0,3) + secondPart.substring(0,3) + yearString.substring(2,4) + monthString +  dayString;
    }
}