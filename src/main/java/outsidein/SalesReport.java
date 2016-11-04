package outsidein;

import java.io.PrintStream;
import java.util.Map;

/**
 * Created by c1900406 on 08/08/2015.
 */
public class SalesReport {

    private SalesAnalyser analyser;
    private PrintStream out;

    public SalesReport(SalesAnalyser analyser, PrintStream out) {
        this.analyser = analyser;
        this.out = out;
    }

    public void run() {
        Map<String, Integer> citySales = analyser.tallyCitySales();

        for (Map.Entry<String, Integer> entry : citySales.entrySet()) {
            out.printf("- %-15s - %6.6s -%n", entry.getKey(), entry.getValue());
        }
    }
}
