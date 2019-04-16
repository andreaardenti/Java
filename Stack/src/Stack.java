import com.sun.deploy.util.ArrayUtil;
import java.util.Arrays;
import java.util.Scanner;

public class Stack {
    private int[] array;
    private int[] array2;

    private int level = 0;

    public Stack(int size) {
        this.array = new int[size];
    }

    public void push(int x) {
        if (!this.isFull()) {
            this.array[level] = x;
            this.level++;
        }
    }

    public void autoInsertElement(){
        int[] array2 = new int[3];
        for(int i = 0; i <  array2.length; i++) {
            array2[i] = (int)(Math.random() * 100);
            System.out.print(array2[i] + "  ");
        }
    }

    public int maxValue() {
        int highest = array2[0];
        for (int i=0; i<array2.length; i++) {
            if (array2[i]>highest){
                highest = array2[i];
            }
        }return  maxValue();
    }

    public void pop() {
        if (this.level > 0) {
            this.array[this.level - 1] = 0;
            this.level--;
        }
    }

    public boolean isFull(){
        return this.level == this.array.length;
    }

    public void extractElement() {
//        array = ArrayUtil.removeElements(array, 2);
//        array = ArrayUtils.remove(array, 2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quale elemento dell'array vuoi rimuovere? ");
        int x = scanner.nextInt();
        int removeElement = x; //in realtà potevo considerare x l'elemento da rimuovere, ma preferisco associarlo ad una variabile per leggere meglio l'algoritmo!
        for (int i = removeElement; i < array.length -1; i++){
            array[i] = array[i+1];
        }
        array[level-1] = 0; // mi serve per non duplicare l'ultimo elemento dell'array, ed associarlo a zero...
    }

    public void Shift(int newValue) {
        for (int i = array.length - 1; i>0; i--) {
            array[i]= array[i-1];
        }
        array[0] = newValue;
    }

    public void unShift(int newValue) {
        for (int i = 0; i < array.length-1; i++) {
            array[i]= array[i+1];
        }
        array[array.length-1] = newValue;
    }

//    @Override
//    public String toString() {
//        return "Stack{" + "array=" + Arrays.toString(array) + ", level=" + level + '}';
//    }

}