public class Anziano extends Utente{


    //@Override
    public float detrazione() {
        return (price * 70)/100;
    }

    public int getEta() {
        return eta;
    }

    @Override
    public int setEta(int eta) {
        super.setEta(eta);
        if (eta>65) {
            return (int) detrazione();
        }
        return price;
    }

}
