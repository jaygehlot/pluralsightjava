package generics.part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExamples {

    public static void main(String[] args) {
        Person jayGehlot = new Person("Jay Gehlot", 35);
        Person nidhiGehlot = new Person("Nidhi Gehlot", 30);
        Person anshGehlot = new Person("Ansh Gehlot", 32);

        List<Person> people = new ArrayList<>();
        people.add(jayGehlot);
        people.add(nidhiGehlot);
        people.add(anshGehlot);

        System.out.println("BEFORE SORTING==========\n" + people);

        Collections.sort(people, new AgeComparator());

        System.out.println("AFTER SORTING - ASC AGE==========\n" +people);

        Collections.sort(people, new ReverseComparator<>(new AgeComparator()));

        System.out.println("DESC AGE SORTING==========\n" +people);


        Collections.sort(people, new NameComparator());

        System.out.println("USING NAME COMPARATOR==========\n" +people);


        Collections.sort(people, new ReverseComparator<>(new NameComparator()));

        System.out.println("USING NAME REVERSE COMPARATOR==========\n" +people);

    }

}
