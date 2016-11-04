package outsidein;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c1900406 on 23/08/2015.
 */
public class GenericsTest {

    public static void main(String[] args) {
        List<A> listA = new ArrayList<>();
        List<B> listB = new ArrayList<>();

        //listA = listB;
        //listB = listA;

        listA.add(new B());
        listA.add(new C());



    }


}

class A {

}

class B extends A {

}

class C extends A {

}
