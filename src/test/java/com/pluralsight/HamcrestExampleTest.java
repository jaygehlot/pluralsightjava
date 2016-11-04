package com.pluralsight;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasKey;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by c1900406 on 21/06/2015.
 */
public class HamcrestExampleTest {

    @Test
    public void mapShouldContainValue(){

        Map<String, Integer> values = getValues();

        //diagnostics with junit assertions without text descriptions are not great
        //assertTrue(values.containsKey("B") );

        assertThat(values, hasKey("B"));
    }

    private Map<String, Integer> getValues() {
        final HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("b", 2);
        return map;
    }

    @Test
    public void listOrderingIsIrrelevant(){
        List<Integer> numbers = getNumbers();

        //Assert.assertEquals(5, (int) numbers.get(4));
        //the hamcrest matcher has better diagnostics
        assertThat(numbers, hasItem(5));
    }

    private List<Integer> getNumbers() {
        return Arrays.asList(1, 2, 3, 4);
    }
}
