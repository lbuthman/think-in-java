package src.holdingyourobjects;

import java.util.*;
/**
 * Created by lbuthman on 5/23/17.
 */
public class StatisticsExample {
    public static void main(String[] args) {
        Random random = new Random(42);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i< 10000; i++) {
            int r = random.nextInt(20);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq + 1);
        }

        System.out.println(map);
    }
}
