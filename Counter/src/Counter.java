public class Counter {

    /**costruttore di default*/
    public Counter() {
        this.value = 0;
    }
    /**costruttore che inizializza il Contatore ad uno specifico valore di partenza*/
    public Counter(int value) {
        this.value = value;
    }

    private int value=0;

    public void inc() {
        this.value++;
    }
    public void reset() {
        this.value=0;
    }
    public int getValue() {
        return value;
    }
    public static boolean equals(Counter x, Counter y) {
        return (x.value == y.value);
    }
}