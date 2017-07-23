package src.fourth_edition.innerclasses;

/**
 * Created by lbuthman on 5/20/17.
 */

interface LoudMouth {
    void letItSlip();
}

public class Ex7 {

    private String secret = "I'm a secret to all.";

    private void whisper() {
        System.out.println("psspssppsppsppspss");
    }

    public LoudMouth investigate() {

        return new LoudMouth() {
            public void letItSlip() {
                whisper();
                secret = "Oscar was lying about being sick.";
            }
        };
    }

    public static void main(String[] args) {
        Ex7 ex7 = new Ex7();
        System.out.println(ex7.secret);
        LoudMouth blab = ex7.investigate();
        blab.letItSlip();
        System.out.println(ex7.secret);
    }
}
