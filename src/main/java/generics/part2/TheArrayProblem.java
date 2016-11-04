package generics.part2;

import java.util.Arrays;

public class TheArrayProblem {

    public static void main(String[] args) {

        Person jayGehlot = new Person("Jay Gehlot", 35);
        Person nidhiGehlot = new Person("Nidhi Gehlot", 30);


        Person[] people = {jayGehlot, nidhiGehlot};

        System.out.println(Arrays.toString(people));

        Person anshGehlot = new Person("Ansh Gehlot", 2);

        people = addToArray(anshGehlot, people);
        System.out.println(Arrays.toString(people));
    }


    /**
     * Not great, since had to go an copy the entire array
     * then return it. Example of extra un-needed code.
     *
     * If we want to search for an item in the array, how do
     * we do this...
     * @param person
     * @param array
     * @return
     */
    private static Person[] addToArray(final Person person, Person[] array) {
        final int length = array.length;
        array = Arrays.copyOf(array, length + 1);
        array[length] = person;
        return array;
    }
}
