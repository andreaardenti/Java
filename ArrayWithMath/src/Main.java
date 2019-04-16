public class Main {

    public static void main(String[] args) {

        ArrayWithMath a = new ArrayWithMath();

        a.autoInsertElement();
        System.out.println("Contenuto Array: "+ a);

//        int x = a.maxValue();
//        System.out.println("Il max dell'array è: "+ x);

        int y = a.minValue();
        System.out.println("Il min dell'array è: "+ y);

        int z = a.replaceMax(3);
        System.out.println(z);

        System.out.println("\n\nContenuto dell'Array dopo la sostituzione del valore massimo dell'Array: "+ a);

//        a.sort();
//        System.out.println("\nContenuto dell'array dopo il sort: " + a);

        boolean c = a.contains(15);
        System.out.println("Contiene? : " + c);

        a.bubbleSort();
        System.out.println("BubbleSort: " + a);
    }
}
