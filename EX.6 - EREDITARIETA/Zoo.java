package esercitazioneereditarieta;

public class Zoo {
    Animale Z[];
    
    public Zoo(int N){
        Z = new Animale[N];
    }
    
    public boolean inserisci(Animale a){
        for (int i=0; i<Z.length; i++)
            if (Z[i] == null) {
                Z[i]=a;
                return true;
            }
        return false;
    }
      public boolean elimina(Animale a){
        for (int i=0; i<Z.length; i++)
            if (Z[i]!= null && Z[i].equals(a)) {
                Z[i]=null;
                return true;
            }
        return false;
    }
    public float CalcolaCarne(){
        float c = 0;
        for (int i=0;i<Z.length; i++)
            if (Z[i]!=null) c = c + Z[i].carne();
        return c;
    }
    public float CalcolaVerdura(){
        float c = 0;
        for (int i=0;i<Z.length; i++)
            if (Z[i]!=null) c = c + Z[i].verdura();
        return c;
    }
     public String toString(){
        String s = new String();
        for (int i=0;i<Z.length; i++)
            if (Z[i]!=null) s = s + Z[i].toString() + "\n";
        return s;
    }
    
    
}
