package fb;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("Please enter a maximum range");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        System.out.println(playFizzBuzz(n).toString());
    }

    static StringBuilder playFizzBuzz(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i=1; i <= n; i++) {
            if (isFizzBuzz(i)) {
                sb.append("fizzbuzz ");
            } else if (isBuzz(i)) {
                sb.append("buzz ");
            } else if (isFizz(i)) {
                sb.append("fizz ");
            } else
                sb.append(i).append(" ");
        }
        return sb;
    }

    private static boolean isFizzBuzz(int i) {
        return i % 15 == 0;
    }

    private static boolean isFizz(int i) {
        return i % 3 == 0;
    }

    private static boolean isBuzz(int i) {
        return i % 5 == 0;
    }
}
