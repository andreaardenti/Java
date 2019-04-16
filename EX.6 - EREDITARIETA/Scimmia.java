
package esercitazioneereditarieta;

public class Scimmia extends Onnivori{
    public Scimmia (String n, float f){
        setNome(n);
        setPeso(f);
        quantita = 5;
        quantitaVerdura = 6;
     }
    public String toString(){
        return "Mi chiamo   " + getNome() + "   e sono una Scimmia";
    }
    public boolean equals(Animale a){
        return super.equals(a) && (a instanceof Scimmia );
    }
}
}
