package esercitazioneereditarieta;


import esercitazioneereditarieta.Animale;

public abstract class Carnivori extends Animale{
    @Override
    public float carne(){

        return quantita * peso;
    }
    @Override
    public float verdura(){
        return 0;}
 }
