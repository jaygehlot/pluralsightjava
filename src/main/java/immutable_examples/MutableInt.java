package immutable_examples;

public class MutableInt {

    public int number;

    public MutableInt(int a) {
        this.number = a;
    }

    @Override
    public String toString() {
        return "MutableInt{" +
                "number=" + number +
                '}';
    }
}
