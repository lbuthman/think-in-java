package src.innerclasses;

/**
 * Created by lbuthman on 5/20/17.
 */
public class Ex7 {

    private String secret = "I'm a secret to all.";

    private void whisper() {
        System.out.println("psspssppsppsppspss");
    }

    public class LoudMouth {

        public void letItSlip() {
            whisper();
            secret = "Oscar was lying about being sick.";
        }
    }

    public LoudMouth investigate() {
        return new LoudMouth();
    }

    public static void main(String[] args) {
        Ex7 ex7 = new Ex7();
        System.out.println(ex7.secret);
        LoudMouth lm = ex7.investigate();
        lm.letItSlip();
        System.out.println(ex7.secret);
    }
}
