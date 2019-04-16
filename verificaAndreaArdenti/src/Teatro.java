public class Teatro {
    private int totAbbonamenti = 100;
    private int totAbbonamentiAnziano = 0;
    private int totAbbonamentiBambino = 0;
    private int totAbbonamentiAdulto = 0;

    private String nomeTeatro;
    private  Utente abbonamenti[];

    private int addAbbonamento, deleteAbbonamento, printAbbonamento[];

    public void addUtente(Utente u) {
        abbonamenti[abbonamenti.length]=u;
    }

    public Utente getUtente(int posizione) {
        return abbonamenti[posizione];
    }

}
