public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;

    public void setName (String name) {
        this.name = name;
    }

    public void setSurname (String surname) {
        this.surname = surname;
    }

    public boolean setAge (int age) {
        if (age>0 && age<100) {
            this.age = age;
            return true;
        }
        else {
            System.out.println("Hai inserito una età sbagliata.");
            return false;
        }
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}






