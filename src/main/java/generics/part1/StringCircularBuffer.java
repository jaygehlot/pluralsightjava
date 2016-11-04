package generics.part1;

public class StringCircularBuffer {

    private String[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;

    public StringCircularBuffer(int size) {
        this.buffer = new String[size];
    }

    public boolean offer(String value) {
        if (buffer[writeCursor] != null) {
            return false;
        }

        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);
        return true;
    }

    public String poll() {

        final String polledValue = buffer[readCursor];

        if (polledValue != null) {
            buffer[readCursor] = null;
            readCursor = next(readCursor);
        }
        return polledValue;
    }

    private int next(int index) {
        return (index + 1) % buffer.length;
    }
}
