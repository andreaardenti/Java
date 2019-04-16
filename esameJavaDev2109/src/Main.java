public class Main {

    public static void main(String[] args) {

        DevArray a = new DevArray();

        a.autoInsertElement();
        System.out.println("Contenuto Array: "+ a);

        a.reverseArray();
        System.out.println("Contenuto array dopo il reverse: " + a);

        int temp = a.checkFirstChar('1');
        System.out.println("Nr. Occorrenze nell'array: " + temp);

        a.replaceArray('1', 777);
        System.out.println("Array modificato con nuovo numero: " + a);

        a.sort("asc");
        System.out.println("Array ordinato: " + a);

        a.sum();
        System.out.println("Sommatoria: " + a);

    }
}
