package immutable_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutablePointRunner {

    public static void main(String[] args) {
        List<ImmutablePoint> startLocations = new ArrayList<>();
        List<ImmutablePoint> endLocations = new ArrayList<>();

        ImmutablePoint myLocation = new ImmutablePoint(1, 1);       //creating the two objects here
        ImmutablePoint yourLocation = new ImmutablePoint(10, 20);

        startLocations.add(myLocation);
        startLocations.add(yourLocation);

        System.out.println("startLocations: " + Arrays.toString(startLocations.toArray()));

        ImmutablePoint myLocation2 = new ImmutablePoint(100, 100);       //creating the two objects here
        ImmutablePoint yourLocation2 = new ImmutablePoint(-10, -20);

        endLocations.add(myLocation2);
        endLocations.add(yourLocation2);

        System.out.println("endLocations: " + Arrays.toString(endLocations.toArray()));

        System.out.println("==========PRINT startLocations for second time=================");
        System.out.println("startLocations: " + Arrays.toString(startLocations.toArray()));
    }

}
