package generics.part2;

import static java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args) {

        Person jayGehlot = new Person("Jay Gehlot", 35);
        Person nidhiGehlot = new Person("Nidhi Gehlot", 30);
        Person anshGehlot = new Person("Ansh Gehlot", 2);

        Map<String, Person> familyMap = new HashMap<>();
        familyMap.put(jayGehlot.getName(), jayGehlot);
        familyMap.put(nidhiGehlot.getName(), nidhiGehlot);
        familyMap.put(anshGehlot.getName(), anshGehlot);

        System.out.println(familyMap);

        System.out.println(familyMap.get("Nidhi Gehlot"));

        printNamesUsingKeySet(familyMap);
        printValuesUsingValues(familyMap);
        printEntryUsingEntrySet(familyMap);
    }

    private static void printNamesUsingKeySet(Map<String, Person> familyMap) {
        System.out.println("\nUSING KEYSET=============");

        for (String name: familyMap.keySet()) {
            System.out.println(name);
        }
    }

    private static void printValuesUsingValues(Map<String, Person> familyMap) {
        System.out.println("\nUSING VALUES=============");

        for (Person person: familyMap.values()) {
            System.out.println(person);
        }
    }

    private static void printEntryUsingEntrySet(Map<String, Person> familyMap) {
        System.out.println("\nUSING ENTRYSET=============");

        for (Entry<String, Person> entry: familyMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

}
