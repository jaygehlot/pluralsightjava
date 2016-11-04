package generics.part1;

public class TypeUnsafeExample {

    public static void main(String[] args) {

        StringCircularBuffer buffer = new StringCircularBuffer(10);

        buffer.offer("a");
        buffer.offer("bc");
        buffer.offer("d");

        String value = concantenate(buffer);
        System.out.println(value);

    }

    private static String concantenate(StringCircularBuffer buffer) {
        StringBuilder stringBuilder = new StringBuilder();

        String value;
        while ((value = buffer.poll()) != null) {
            stringBuilder.append(value);
        }
        return stringBuilder.toString();
    }
}
