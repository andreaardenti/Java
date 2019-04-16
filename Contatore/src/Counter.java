public class Counter {

    private int value;

    public void inc() {
        this.value++;
    }

    public void reset() {
        this.value = 0;
    }

    public void add() {
        this.value = value + value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "" +
                "value=" + value +
                '}';
    }
}
