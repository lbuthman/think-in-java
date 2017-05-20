package src.interfaces;

import java.util.Random;

/**
 * Created by lbuthman on 5/20/17.
 */

interface DecisionMaker {
    void decide(int i);
}

interface DecisionMakerFactory {
    DecisionMaker getDecision();
}

class DiceDecision implements DecisionMaker {
    public void decide(int i) {
        switch (i) {
            case 1:
                System.out.println("You've made a huge mistake.");
                break;
            case 2:
                System.out.println("Win Win Win");
                break;
            case 3:
                System.out.println("1 in a million, I'm saying there's a chance.");
                break;
            case 4:
                System.out.println("Hmm, not sure, ask again.");
                break;
            case 5:
                System.out.println("That would result in the worst timeline.");
                break;
            case 6:
                System.out.println("You knew it was an A+, but you forgot about A++.");
                break;
            default:
                System.out.println("Roll again dude.");
        }
    }
}

class DiceDecisionFactory implements DecisionMakerFactory {
    public DecisionMaker getDecision() {
        return new DiceDecision();
    }
}

class CoinDecision implements DecisionMaker {
    public void decide(int i) {
        if (i == 0) {
            System.out.println("Don't do it.");
        } else {
            System.out.println("Go for it!");
        }
    }
}

class CoinDecisionFactory implements DecisionMakerFactory {
    public DecisionMaker getDecision() {
        return new CoinDecision();
    }
}

public class Ex19 {

    public static void askQuestion(DecisionMakerFactory dmf, int i) {

        DecisionMaker dm = dmf.getDecision();
        dm.decide(i);
    }

    public static void main(String[] args) {

        Random rand = new Random(42);

        askQuestion(new CoinDecisionFactory(), rand.nextInt(2));
        askQuestion(new DiceDecisionFactory(), rand.nextInt(6));

    }
}
