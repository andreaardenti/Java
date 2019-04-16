public class Adulto extends Utente{

    //@Override
    public float detrazione() {
        return (price * 100)/100;
    }

    public int getEta() {
        return eta;
    }

    @Override
    public int setEta(int eta) {
        super.setEta(eta);
        if (eta>10 && eta<=65) {
            return (int) detrazione();
        }
        return price;
    }
}
