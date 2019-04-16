public class Utente extends Teatro {

    private String name;
    private String surname;
    private String eMail;
    protected int price = 100;
    protected int eta;

    public void setName (String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String geteMail() {
        return eMail;
    }

    public int getPrice() {
        return price;
    }

    public int getEta() {
        return eta;
    }

    public int setEta(int eta) {
        this.eta = eta;
        return eta;
    }
}
