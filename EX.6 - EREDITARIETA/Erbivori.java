package esercitazioneereditarieta;
public abstract class Erbivori extends Animale{
    @Override
    public float verdura(){
        return quantita * peso;
    }
    @Override
    public float carne(){return 0;} 
 }
