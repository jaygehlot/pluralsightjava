package generics;

import static java.lang.Integer.toBinaryString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryNumbers {

    final static int BASE_10_INT = 13;

    public static void main(String[] args) {
        System.out.println(getMaxNumberOfConsecutiveOnesFromBinaryRepOfInt(BASE_10_INT));
    }

    private static int getMaxNumberOfConsecutiveOnesFromBinaryRepOfInt(int number) {
        String base10IntAsString = toBinaryString(number);
        List<Integer> consecutivesOnes = new ArrayList<>();

        int counter = 0;
        for (int i = 0; i < base10IntAsString.length(); i++) {
            if (isCurrentCharEqualToOne(base10IntAsString.charAt(i))) {
                counter++;
            } else if (base10IntAsString.charAt(i) == '0') {
                consecutivesOnes.add(counter);
                counter = 0;
            }
        }

        consecutivesOnes.add(counter);
        return Collections.max(consecutivesOnes);
    }

    private static boolean isCurrentCharEqualToOne(char firstChar) {
        return firstChar == '1' ;
    }
}
