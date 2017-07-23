package src.fourth_edition.holdingyourobjects;
import java.util.*;

/**
 * Created by lbuthman on 5/21/17.
 */

class Flow {
    String[] lyrics = new String[7];
    String[] getFlow() {
        lyrics[0] = "Lord please have sympathy and forgive my cool young history.";
        lyrics[1] = "I got flows for the Marilyn Monroe's, know about your cons but focus on your pros.";
        lyrics[2] = "Me I'm in my spaceship, that's right I work for NASA.";
        lyrics[3] = "There's no shortcut to a dream, all blood and sweat and life is what you manage in between.";
        lyrics[4] = "The streets were wet and the gate was locked, so I jumped it and let you in.";
        lyrics[5] = "Never betray the way you always know it is.";
        lyrics[6] = "To wait for you is against the odds, but it's a chance I got to take.";
        return lyrics;
    }
}

public class Ex7 {
    public static void main(String[] args) {
        ArrayList<String> flows = new ArrayList<>(Arrays.asList(new Flow().getFlow()));
        for (String lyric: flows) {
            System.out.println(lyric);
        }
        System.out.println("================================================");
        ArrayList<String> cuts = new ArrayList<>(flows.subList(0, 4));
        flows.removeAll(cuts);
        for (String lyric: flows) {
            System.out.println(lyric);
        }

    }
}
