import java.text.SimpleDateFormat;

public class User {
    private String name;
    private String surname;
    private String dateOfBirth;

    public User (String name, String surname, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", dateOfBirth=" + dateOfBirth + '}';
    }

    public String getName() {
        return name.substring(0, 3);
    }

    public String getSurname() {
        return surname.substring(0, 3);
    }

    public String getDateOfBirth() {
        return dateOfBirth.substring(2, 4);
    }
}
