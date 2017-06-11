package immutable_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MutablePointRunner {

    public static void main(String[] args) {
        List<MutablePoint> startLocations = new ArrayList<>();
        List<MutablePoint> endLocations = new ArrayList<>();


        MutablePoint myLocation = new MutablePoint(1, 1);       //creating the two objects here
        MutablePoint yourLocation = new MutablePoint(10, 20);

        startLocations.add(myLocation);
        startLocations.add(yourLocation);

        System.out.println("startLocations: " + Arrays.toString(startLocations.toArray()));

        myLocation.setX(100);               //modifying both objects here
        myLocation.setY(100);

        yourLocation.setX(-10);
        yourLocation.setY(-20);

        endLocations.add(myLocation);
        endLocations.add(yourLocation);

        System.out.println("endLocations: " + Arrays.toString(endLocations.toArray()));

        System.out.println("==========PRINT startLocations for second time=================");
        System.out.println("startLocations: " + Arrays.toString(startLocations.toArray()));
    }


}
