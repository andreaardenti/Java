public class Pizza {
    private boolean cottura = false;
    private String nomePizza;


    public Pizza (String pizza){
        this.nomePizza = pizza;
    }

    public boolean isCottura() {
        return cottura;
    }

    public void setCottura(boolean cottura) {
            this.cottura = cottura;
        }
}
