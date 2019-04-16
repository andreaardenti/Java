public class Oven {

    private Pizza full;

    public void insertPizza(Pizza full) {
        if (this.full != null){
            System.out.println("Il forno è vuoto");
            return;
        }
        System.out.println("Il forno è pieno");
        this.full = full;
    }


    public void removePizza(Pizza full) {
        this.full = null;
    }

}
