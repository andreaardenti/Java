public class Bambino extends Utente{

    //@Override
    public float detrazione() {
        return (price * 70)/100;
    }

    //@Override
    public float free() {
        return (price - price);
    }

    public int getEta() {
        return eta;
    }

    @Override
    public int setEta(int eta) {
        super.setEta(eta);
        if (eta>5 && eta<=10) {
            return (int) detrazione();
        }

        else if (eta<5) {
                return (int) free();
            }
        return price;
    }

}
