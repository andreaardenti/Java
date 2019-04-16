package esercitazioneereditarieta;


public abstract class Animale {
    protected String nome;
    protected float peso;
    protected float quantita;
    
    public void setNome(String n){
        nome = n;}

    public void setPeso(float f) {
        peso = f;}

    public String getNome() {
        return nome;}

    public float getPeso() {
        return peso;}

    public float getQuantita() {
        return quantita;}

    public abstract float carne();

    public abstract float verdura();

    public boolean equals (Animale a){

        return nome.equals(a.getNome());}

    public String toString(){
        return "mi chiamo" + nome; 
    }
}
