package esercitazioneereditarieta;
public abstract class Onnivori extends Animale{
    float quantitaVerdura;
    @Override
    public float carne(){
        return quantita * peso;
    }
    @Override
    public float verdura(){
        return quantitaVerdura * peso;
    }
}
   
