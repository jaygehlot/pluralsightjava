package generics.part3;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {

    private Comparator<T> delegateComparator;

    public ReverseComparator(final Comparator<T> delegateComparator) {
        this.delegateComparator = delegateComparator;
    }

    @Override
    public int compare(T left, T right) {
        System.out.println("person1 = " + left);
        System.out.println("person2 = " + right);

        return  -1 * delegateComparator.compare(left, right);
    }
}
