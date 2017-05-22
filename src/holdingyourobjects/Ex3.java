package src.holdingyourobjects;

import java.util.*;

/**
 * Created by lbuthman on 5/21/17.
 */

class NameGenerator {
    Random random = new Random(42);
    public String next() {
        switch(random.nextInt(5)) {
            default:
            case 0:
                return "Luke Skywalker";
            case 1:
                return "Princess Laya";
            case 2:
                return "C3P0";
            case 3:
                return "Yoda";
            case 4:
                return "Darth Vader";
        }
    }
}

public class Ex3 {
    public static void main(String[] args) {
        NameGenerator name = new NameGenerator();

        ArrayList<String> al = new ArrayList<>();
        LinkedList<String> ll = new LinkedList<>();
        HashSet<String> hs = new HashSet<>();
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        TreeSet<String> ts = new TreeSet<>();

        for (int i=0; i<10; i++) {
            al.add(name.next());
            ll.add(name.next());
            hs.add(name.next());
            lhs.add(name.next());
            ts.add(name.next());
        }

        System.out.println(al.toString());
        System.out.println(ll.toString());
        System.out.println(hs.toString());
        System.out.println(lhs.toString());
        System.out.println(ts.toString());
    }
}
