package generics.part4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NonGenericMethodSortingExamples {

    public static void main(String[] args) {

        Person jayGehlot = new Person("Jay Gehlot", 35);
        Person nidhiGehlot = new Person("Nidhi Gehlot", 30);
        Person anshGehlot = new Person("Ansh Gehlot", 2);

        List<Person> people = new ArrayList<>();
        people.add(jayGehlot);
        people.add(nidhiGehlot);
        people.add(anshGehlot);

        final Person youngestCastMember = (Person) min(people, new AgeComparator());
        //the second argument here is not type safe, the AgeComparator can be any type

        System.out.println(youngestCastMember);
    }

    public static Object min(List values, Comparator comparator) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("List is empty, cannot find minimum");
        } else {
            Object lowestElement = values.get(0);

            for (int i=1; i < values.size(); i++) {
                Object element = values.get(i);

                if(comparator.compare(element, lowestElement) < 0) {
                    lowestElement = element;
                }
            }
            return lowestElement;
        }
    }

}
