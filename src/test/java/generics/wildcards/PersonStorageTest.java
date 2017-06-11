package generics.wildcards;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonStorageTest {

    private Partner donDrapper = new Partner("Don Draper", 89);
    private Partner bertCooper = new Partner("Bert Cooper", 100);
    private Employee peggyOlson = new Employee("Peggy Olson", 65);

    private File file;
    private PersonSaver saver;
    private PersonLoader loader;

    @Before
    public void setup() throws IOException {
        file = File.createTempFile("tmp", "people");
        saver = new PersonSaver(file);
        loader = new PersonLoader(file);
    }

    @Test
    public void savesAndLoadsPerson() throws Exception {
        //Person person = new Person("Bob", 20);

        saver.save(donDrapper);

        assertEquals(donDrapper, loader.load());
    }

    /*@Test
    public void savesAndLoadsArrayOfPeople() throws Exception {
        //Person is parent class
        //Employee and Partner are children classes
        Employee[] employees = new Employee[2];
        Person[] persons = employees;

        //will get an ArrayStoreException, because here we are trying to put a Partner into
        //and Employee array
        persons[0] = donDrapper;
        persons[1] = bertCooper;

        saver.saveAll(employees);

        assertEquals(donDrapper, loader.load());
        assertEquals(bertCooper, loader.load());
    }*/

    @Test
    public void savesAndLoadsArrayOfPeople() throws Exception {

        List<Partner> persons = new ArrayList<>();

        persons.add(donDrapper);
        persons.add(bertCooper);

        saver.saveAll(persons);

        assertEquals(donDrapper, loader.load());
        assertEquals(bertCooper, loader.load());
    }

    @Test
    public void loadsListOfPeople() throws Exception {
        saver.save(donDrapper);
        saver.save(bertCooper);

        List<Object> people = new ArrayList<>();
        loader.loadAll(people);

        assertEquals(donDrapper, people.get(0));
        assertEquals(peggyOlson, people.get(0));

    }

    @After
    public void tearDown() {
        if (file.exists()) {
            file.delete();
        }
    }

}
