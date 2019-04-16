
package esercitazioneereditarieta;

import java.io.*;
class Input {
    public static String leggiStringa() throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(r);
        String s =in.readLine();
    return s;
}
    public static int leggiIntero() throws IOException{
        String s = leggiStringa();
        return Integer.parseInt(s);
    }

    public static float leggiFloat() throws IOException{
        String s = leggiStringa();
        return Float.parseFloat(s);
    }
 } 

public class EsercitazioneEreditarieta  {
    
    public static void main(String[] args) throws IOException {
        Zoo MioZoo;
        /* creazione dello zoo*/
        System.out.println("inserisci la dimenzionme dello zoo");
        int N = Input.leggiIntero();
        MioZoo = new Zoo(N);
        //menu con tutte le opzioni   
        Animale a;        
        String M [] = {"1)inserisci un nuovo animale", 
            "2) elimina un animale", 
            "3)calcola la quantita di carne" , 
            "4)calcola la quantita di verdura",   
            "5)stampa tutti"};
        int scelta = 0;
        do {
          scelta = menu(M);
          switch (scelta){
              case 1: { 
                  a = creaAnimale();
                  MioZoo.inserisci(a);
                  break;
              }
              case 2: {
                  a = creaAnimale();
                  MioZoo.elimina(a);
                  break;
              }
              case 3: {
                  System.out.println(MioZoo.CalcolaCarne());
                  break;
              }
              case 4: {
                  System.out.println(MioZoo.CalcolaVerdura());
                  break;
              }
              case 5:{
                  System.out.println(MioZoo);
                  break;
              }              
          }
        }while (scelta !=0);
  }
    
    private static Animale  creaAnimale()throws IOException{
                System.out.println("inserisci il nome dell'animale da inserire");
                String n = Input.leggiStringa();
                System.out.println("inserisci la specie dell'animale");
                String s = Input.leggiStringa();
                System.out.println("inserisci il peso dell'animale");
                float p = Input.leggiFloat();
                if (s.equals("tigre")) return new Tigre(n,p);
                if (s.equals("scimmia")) return new Scimmia(n,p);
                else return null;
    }
    
    private static int menu(String s[]) throws IOException{
        int i;
        for (String x : s) {
            System.out.println(x);
        }
        return i=Input.leggiIntero();
    }    
}
