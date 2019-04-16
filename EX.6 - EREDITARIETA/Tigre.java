package esercitazioneereditarieta;
public class Tigre extends Carnivori{
    public Tigre (String n, float f){
        setNome(n);
        setPeso(f);
        quantita = 5;
     }
    public String toString(){
        return "Mi chiamo   " + getNome() + "    e sono una Tigre";
    }
    public boolean equals(Animale a){
        return super.equals(a) && (a instanceof Tigre );
    }
}
