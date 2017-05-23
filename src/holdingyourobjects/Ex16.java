package src.holdingyourobjects;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by lbuthman on 5/23/17.
 */
public class Ex16 {
    public static void main(String[] args) {

        Set<String> vowelSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        String vowels = "a e i o u";
        Collections.addAll(vowelSet, vowels.split(" "));

        ArrayList<String> wordSet = new ArrayList<>();
        String text = "Hi, my name is Bingo, I like to climb things. " +
                "Can I have a banana please? Eek eek. I'm a ninja, it's " +
                "my birthday, I'm a ninja.";
        Collections.addAll(wordSet, text.split(" "));

        int totalVowels = 0;

        for (String word: wordSet) {
            int localVowels = 0;
            for (String vowel: vowelSet) {
                for (int i=0; i<word.length(); i++) {
                    if (vowel.contains(word.substring(i, i + 1).toLowerCase())) {
                        localVowels++;
                        totalVowels++;
                    }
                }
            }
            System.out.println("Word " + word + " has " + localVowels + " vowels.");
        }

        System.out.println("There are " + totalVowels + " vowels present.");

    }
}
