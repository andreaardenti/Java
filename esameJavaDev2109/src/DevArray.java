/**
 * Si crei un vettore di dimensione parametrizzabile con numeri randomatici al suo interno:
 * ▸ Si creino i seguenti metodi //DONE
 *
 * Reverse, il vettore dovrà essere ribaltato. //DONE
 *
 * Trova il numero che inizia con x, passiamo un numero come parametro e verificare quante ricorrenze ci saranno
 * con il numero che inizia con x, es x=3, ▸ 3 ok, x = 21 ▸ ok 24 = no //DONE
 *
 * Trova il numero che inizia con x, stesso principio del precedente ma con sostituzione di un nuovo numero passato
 * sempre da input. //DONE
 *
 * Sommatoria dei precedenti fino a metà vettore, e poi sommatoria negativa, ex 3 5 7 12 | 4 8 14 10
 * diventerà 3 8 15 27 23 15 1 -9.
 */


import java.util.Arrays;
import java.util.Scanner;

public class DevArray {

    Scanner in = new Scanner(System.in);
    int arraySize = in.nextInt();

    private int[] array = new int[arraySize];

    public void autoInsertElement(){

        //faccio inserire la dimensione dell'array all'utente

        for(int i=0; i<array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
    }

    public void sort(String param1) {
        int temp = 0;

        switch (param1) {
            case "asc":
                for (int i = 0; i < array.length; i++) {
                    for (int j = 1; j < array.length; j++) {
                        if (array[j-1] > array[j]) {
                            temp = array[j-1];
                            array[j-1] = array[j];
                            array[j] = temp;
                        }
                    }
                }
                break;

            case "desc":
                for (int i = 0; i < array.length; i++) {
                    for (int j = 1; j < array.length; j++) {
                        if (array[j-1] < array[j]) {
                            temp = array[j-1];
                            array[j-1] = array[j];
                            array[j] = temp;
                        }
                    }
                }
                break;
        }
    }

    public void reverseArray() {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    public int checkFirstChar(int charToCheck) {

        //converto array int in array string
        String string[] = new String[array.length];
        for(int i = 0; i<array.length;++i)
        {
            string[i] = Integer.toString(array[i]);
        }

        int occurrency=0;

        for(int i=0; i<string.length; i++) {
            if (string[i].charAt(0) == charToCheck){
                occurrency++;
            }
        } return occurrency;
    }

    public void replaceArray(char charToCheck, int newNumber){
        String string[] = new String[array.length];
        for(int i = 0; i<array.length;++i)
        {
            string[i] = Integer.toString(array[i]);
        }

        for(int i=0; i<string.length; i++) {
            if (string[i].charAt(0) == charToCheck){
                array[i] = newNumber;
            }
        }
    }

    public void sum(){
        for (int i=0; i<array.length/2 - 1; i++) {
            array[i+1] = array[i]+array[i+1];
        }
        for (int i=array.length/2 ; i<=array.length-1; i++) {
            array[i] = array[i-1]-array[i];
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}