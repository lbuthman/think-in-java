package src.fourth_edition.holdingyourobjects;

import java.util.*;

/**
 * Created by lbuthman on 5/21/17.
 */
public class Ex2 {
    public static void main(String[] args) {
        Set<Integer> c = new TreeSet<Integer>() {};
        for (int i=0; i<10; i++) { c.add(i); }
        for (Integer n: c) {
            System.out.print(n + ", ");
        }
    }
}
