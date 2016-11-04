package com.pluralsight;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * Created by c1900406 on 02/08/2015.
 */
public class SalesReportSystemTest {

    @Test
    public void shouldPrintStoreReportForSampleData() {

        ApplicationRunner runner = new ApplicationRunner();

        String report = runner.run("src/main/resources/example-sales.csv");

        assertThat(report, containsString("- London          -    235 -"));
    }
}
