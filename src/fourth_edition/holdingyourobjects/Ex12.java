package src.fourth_edition.holdingyourobjects;

import java.util.*;

/**
 * Created by lbuthman on 5/22/17.
 */
public class Ex12 {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> numsForward = new ArrayList<>(Arrays.asList(ints));
        ListIterator<Integer> it = numsForward.listIterator(numsForward.size());

        ArrayList<Integer> numsBackward = new ArrayList<>();

        while (it.hasPrevious()) {
            numsBackward.add(it.previous());
        }

        System.out.println(numsForward);
        System.out.println(numsBackward);
    }
}
