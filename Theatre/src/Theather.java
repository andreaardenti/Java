public class Theather {

    private double price;
    private double profit = 0;
    private User[] seats;

    public Theather (int param1, int n0fPlace) {
        this.price = param1;
        this.seats = new User[n0fPlace];
    }

    public void assignPlace(User user, int place) {
        if (user.getAge() > 5 && user.getAge() < 10 ) {
            this.price = this.price * 0.3;
        } else if (user.getAge() >= 65) {
            this.price = this.price * 0.7;
        } else {
            this.profit += this.price;
        }

        this.seats[place] = user;
    }

    public String getArchive() {
        String archive ="";
        for (int i=0; i < seats.length; i++) {
            archive += i + " " + seats[i] + "\n";
        }
        return archive;
    }

    public double getProfit() {
        return this.profit;
    }
}
