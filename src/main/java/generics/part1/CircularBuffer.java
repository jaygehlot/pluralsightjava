package generics.part1;

public class CircularBuffer<T> {

    private T[] buffer;
    private int readCursor = 0;
    private int writeCursor = 0;

    public CircularBuffer(int size) {
        this.buffer = (T[]) new Object[size];
    }

    public boolean offer(T value) {
        if (buffer[writeCursor] != null) {
            return false;
        }

        buffer[writeCursor] = value;
        writeCursor = next(writeCursor);
        return true;
    }

    public T poll() {

        final T polledValue = buffer[readCursor];

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
