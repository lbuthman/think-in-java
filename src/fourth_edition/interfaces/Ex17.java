package src.fourth_edition.interfaces;

/**
 * Created by lbuthman on 5/20/17.
 */

interface proved {
    String changeMe = "can't touch this";
}

public class Ex17 implements proved {
    public static void main(String[] args) {
        //changeMe = "hammer time";
    }
}
