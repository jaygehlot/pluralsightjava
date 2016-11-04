package com.pluralsight;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;
import outsidein.Sale;
import outsidein.SalesRepository;

import java.util.List;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasProperty;

public class SalesRepositoryTest {

    @Test
    public void shouldLoadSampleData() {
        SalesRepository salesRepository = new SalesRepository("src/main/resources/example-sales.csv");

        List<Sale> sales = salesRepository.loadSales();

        Assert.assertThat(sales, hasItem(allOf(
            hasProperty("store", equalTo("London")),
            hasProperty("number", equalTo(2)),
            hasProperty("pricePerItem", equalTo(30))
        )));
    }
}
