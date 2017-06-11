package com.pluralsight;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;

/**
 * Created by c1900406 on 13/06/2015.
 */
public class CafeTest {

    public static final int ESPRESSO_BEANS = CoffeeType.Espresso.getRequiredBeans();
    public static final int NO_MILK = 0;
    public static final int NO_BEANS = 0;
    public static final int LATTE_MILK = CoffeeType.Latte.getRequiredMilk();

    private Cafe cafe;

    @Before
    public void before() {
        cafe = new Cafe();
    }

    @Test
    public void canBrewExpresso() {

        //Given
        //need to actually stock the beans to make an Espresso
        withBeans();

        //When
        Coffee coffee = cafe.brew(CoffeeType.Espresso);

        //Then
        Assert.assertEquals("Wrong coffee type", CoffeeType.Espresso, coffee.getType());
        //could break the test by changing level of milk from 0 to 1
        Assert.assertEquals("Wrong amount of milk", NO_MILK, coffee.getMilk());

        //hasProperty will check whether the coffee object has number public field or number getter that returns 'beans'
        //number hamcrest matcher is composite so, it can take another matcher as an argument also
        //provides good diagnostics, allows composition of two matchers

        assertThat(coffee, hasProperty("beans", equalTo(ESPRESSO_BEANS)));
        //Assert.assertEquals("Wrong number of beans", ESPRESSO_BEANS, coffee.getBeans());
    }

    @Test
    public void canBrewLatte(){
        //give
        withBeans();
        cafe.restockMilk(LATTE_MILK);

        //when
        Coffee coffee = cafe.brew(CoffeeType.Latte);

        //then
        Assert.assertEquals("Wrong coffee type", CoffeeType.Latte, coffee.getType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void mustRestockMilk() {

        cafe.restockMilk(NO_MILK);
    }

    @Test(expected = IllegalArgumentException.class)
    public void mustRestockBeans() {

        cafe.restockBeans(NO_BEANS);
    }

    @Test
    public void brewingEspressoConsumesBeans() {
        //Given
        //need to actually stock the beans to make an Espresso
        withBeans();

        //When
        cafe.brew(CoffeeType.Espresso);

        //Then
        Assert.assertEquals(NO_BEANS, cafe.getBeansInStock());
    }

    //then - failed since no milk available
    @Test(expected = IllegalStateException.class)
    public void latteRequiresMilk() {
        //given
        withBeans();

        //when
        Coffee coffee = cafe.brew(CoffeeType.Latte);
        // throws IllegalStateException
    }

    private void withBeans() {
        cafe.restockBeans(ESPRESSO_BEANS);
    }
}
