package src.holdingyourobjects;

import java.util.LinkedList;

/**
 * Created by lbuthman on 5/22/17.
 */
public class Ex14 {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();

        for (int i=0; i<20; i++) {
            int index = link.size() / 2;
            link.add(index, i);
        }

        System.out.println(link);
    }
}
