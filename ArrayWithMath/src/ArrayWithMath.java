import java.util.Arrays;


public class ArrayWithMath {

    private int[] array = new int[10];

    public void autoInsertElement(){
        for(int i = 0; i <  array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
    }

    public int[] maxValue() {
        int[] twoArray = new int[2];
        int highest = array[0];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (this.array[i] > highest){
                highest = this.array[i];
                position = i;
//                System.out.println("questo è i: " + position);
            }
        }
        twoArray[0]=highest;
        twoArray[1]=position;
        return twoArray;
    }

    public int minValue() {
        int lower = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < lower){
                lower = array[i];
            }
        }
        return lower;
    }

    public int replaceMax(int newValue) {
        int[] p  = this.maxValue();
        int position = p[1];
        this.array[position] = newValue;
        System.out.println("\nSono dentro la funzione replaceMax\n" + "Il valore massimo dell'array è: " + p[0]);
        return p[0];
    }

//  Array sort
    public int[] sort() {
        Arrays.sort(array);
        return array;
    }

//  Verifica se un numero esiste nell'array
    public boolean contains (int item) {
        for (int n : this.array) {
            if (item == n) {
                return true;
            }
        }return false;
    }

//  Bubble sort
    public void bubbleSort() {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
            if (array[j-1] > array[j]) {
                temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
