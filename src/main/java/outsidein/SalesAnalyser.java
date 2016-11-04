package outsidein;

import java.util.HashMap;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class SalesAnalyser {

    private SalesRepository repo;

    public SalesAnalyser(SalesRepository repo) {
        this.repo = repo;
    }

    public Map<String, Integer> tallyCitySales() {
        return repo.loadSales().stream().collect(groupingBy(Sale::getStore, summingInt(Sale::getValue)));
    }
}
