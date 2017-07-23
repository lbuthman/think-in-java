package src.fourth_edition.innerclasses;

/**
 * Created by lbuthman on 5/20/17.
 */

interface HiFive {
    void smack();
    void connect();
}

class Hand {
    private class Fist implements HiFive {
        public void smack() {
            System.out.println("you don't understand how to high five.");
        }

        public void connect() {
            System.out.println("nice exploding high five!!");
        }
    }

    public Fist raiseItUp() {
        return new Fist();
    }
}

public class Ex11 {
    public static void main(String[] args) {
        Hand hand = new Hand();
        HiFive hiFive = hand.raiseItUp();
        hiFive.smack();
        hiFive.connect();

    }
}
