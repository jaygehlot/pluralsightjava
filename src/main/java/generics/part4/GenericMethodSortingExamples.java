package generics.part4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericMethodSortingExamples {

    public static void main(String[] args) {

        Person jayGehlot = new Person("Jay Gehlot", 35);
        Person nidhiGehlot = new Person("Nidhi Gehlot", 30);
        Person anshGehlot = new Person("Ansh Gehlot", 2);

        List<Person> people = new ArrayList<>();
        people.add(jayGehlot);
        people.add(nidhiGehlot);
        people.add(anshGehlot);

        final Person youngestCastMember = min(people, new AgeComparator());
        //the second argument here is not type safe, the AgeComparator can be any type

        System.out.println(youngestCastMember);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(min(numbers, Integer::compare));
    }

    public static <T> T min(List<T> values, Comparator<T> comparator) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("List is empty, cannot find minimum");
        } else {
            T lowestElement = values.get(0);

            for (int i=1; i < values.size(); i++) {
                T element = values.get(i);

                if(comparator.compare(element, lowestElement) < 0) {
                    lowestElement = element;
                }
            }
            return lowestElement;
        }
    }

}
