package src.interfaces;

import java.nio.*;
import java.util.*;

/**
 * Created by lbuthman on 5/20/17.
 */

class WheelOfFortune implements Readable {

    private static Random rand = new Random(42);

    private final static char[] consonants = "bcdfghjklmnpqrstvwxyz".toCharArray();
    private final static char[] vowels = "aeiou".toCharArray();

    private int count;

    public WheelOfFortune(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {

        if (count-- == 0) { return -1; }

        //returns a random four letter word
        cb.append(consonants[rand.nextInt(consonants.length)]);
        cb.append(vowels[rand.nextInt(vowels.length)]);
        cb.append(consonants[rand.nextInt(consonants.length)]);
        cb.append(consonants[rand.nextInt(consonants.length)]);

        cb.append(" ");

        return 5; //number of chars
    }
}

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new WheelOfFortune(100));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
