import java.util.Arrays;

public class CD {

    public String[] tracks; //creo la variabile tracks che è un array di stringhe --> "String[]" ...non la inizializzo con alcun valore

    public CD (String[] param){
        this.tracks = param;
    }

    @Override
    public String toString() {
        return "CD {" + "tracks= " + Arrays.toString(tracks) + '}';
    }

}
