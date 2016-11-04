package outsidein;

import java.io.PrintStream;

/**
 * Created by c1900406 on 06/08/2015.
 */
public class SalesReportRunner {

    private PrintStream out;

    public static void main(String[] args) {
        String fileLocation = args[0];
        new SalesReportRunner(System.out).run(fileLocation);
    }

    public SalesReportRunner(final PrintStream out){
        this.out = out;
    }

    public void run(final String location){
        SalesRepository repo = new SalesRepository(location);
        SalesAnalyser analyser = new SalesAnalyser(repo);
        SalesReport report = new SalesReport(analyser, out);
        report.run();
    }
}
