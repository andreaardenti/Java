import java.text.SimpleDateFormat;

public class User {
    private String name;
    private String surname;
    private SimpleDateFormat dateOfBirth = new SimpleDateFormat("yy");

    public User (String name, String surname, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User {" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", dateOfBirth=" + dateOfBirth + '}';
    }

    public String getName() {
        return name.substring(0, 3);
    }

    public String getSurname() {
        return surname.substring(0, 3);
    }

    public SimpleDateFormat getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(SimpleDateFormat dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPrintCodFisc() {
        return "Codice Fiscale Semplificato: " + getName() + getSurname() + getDateOfBirth();
    }
}