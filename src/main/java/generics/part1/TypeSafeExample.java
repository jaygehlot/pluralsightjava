package generics.part1;

public class TypeSafeExample {

    public static void main(String[] args) {

        CircularBuffer<String> buffer = new CircularBuffer<>(10);

        buffer.offer("number");
        buffer.offer("bc");
        buffer.offer("d");

        String value = concantenate(buffer);
        System.out.println(value);

    }

    private static String concantenate(CircularBuffer<String> buffer) {
        StringBuilder stringBuilder = new StringBuilder();

        String value;
        while ((value = buffer.poll()) != null) {
            stringBuilder.append(value);
        }
        return stringBuilder.toString();
    }

}
