package com.pluralsight;

import org.junit.Test;
import outsidein.Sale;
import outsidein.SalesAnalyser;
import outsidein.SalesRepository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by c1900406 on 08/08/2015.
 */
public class SalesAnalyserTest {

    private static final List<Sale> exampleSales = Arrays.asList(
            new Sale("Apples", "Cardiff", 10, 2),
            new Sale("Oranges", "Cardiff", 3, 5),
            new Sale("Bananas", "Cardiff", 6, 20),
            new Sale("Oranges", "London", 5, 7)
    );

    private static final Map<String, Integer> expectedStoreSales = new HashMap<>();
    static {
        expectedStoreSales.put("Cardiff", 155);
        expectedStoreSales.put("London", 35);
    }


    @Test
    public void shouldAggregateStoreSales() {
        // given
        SalesRepository mockRepository = mock(SalesRepository.class);
        when(mockRepository.loadSales()).thenReturn(exampleSales);

        SalesAnalyser analysisService = new SalesAnalyser(mockRepository);

        // when
        Map<String, Integer> storeSales = analysisService.tallyCitySales();

        // then
        assertEquals("Calculated wrong store sales", expectedStoreSales, storeSales);
        verify(mockRepository, times(1)).loadSales();
    }
}
