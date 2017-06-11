package immutable_examples;

public class MutableIntExample {

    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = a;  //b is number new object in memmory
        a += 5;
        System.out.println("a= " + a + "; b= " + b);

        MutableInt mutableInt1 = new MutableInt(5);
        MutableInt mutableInt2 = mutableInt1;   // both variables point to same place in memory
        mutableInt1.number += 5;
        System.out.println("mutableInt1= " + mutableInt1 + "; mutableInt2= " +mutableInt2);
    }
}
