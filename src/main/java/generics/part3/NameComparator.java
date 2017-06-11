package generics.part3;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(final Person person1, final Person person2) {
        return person1.getName().compareTo(person2.getName());
    }
}
