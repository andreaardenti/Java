public class Main {

    public static void main(String[] args) {

        Stack s = new Stack(3);
//        s.push(14);
//        s.push(34);
//        s.push(17);
//        s.push(32);
//        s.push(11);
//        s.push(9);
//        s.pop();
//        System.out.println(s);
//        s.extractElement();
//        System.out.println(s);
//
//        s.Shift(2);
//        System.out.println("Shift: " + s);
//
//        s.unShift(77);
//        System.out.println("unShift: " + s);

        s.autoInsertElement();
        System.out.println(s);

        s.maxValue();
        System.out.println("Il valore massimo dell'array è: " + s);
    }
}
