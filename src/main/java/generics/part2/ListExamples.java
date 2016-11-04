package generics.part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        Person jayGehlot = new Person("Jay Gehlot", 35);
        Person nidhiGehlot = new Person("Nidhi Gehlot", 30);

        List<Person> people = new ArrayList<>();
        people.add(jayGehlot);
        people.add(nidhiGehlot);

        System.out.println(people);

        people.add(new Person("Ansh Gehlot", 2));

        System.out.println(people);
        System.out.println(people.size());


        final Person person = people.get(1);
        System.out.println(person);

        System.out.println("===================\nAll the folks");
        for(Person p: people) {
            System.out.println(p);
        }


        System.out.println("Using Iterator");
        final Iterator<Person> iterator = people.iterator();

        while(iterator.hasNext()) {
            Person p = iterator.next();
            System.out.println(p);
        }


    }
}
