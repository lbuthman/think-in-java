package src.fourth_edition.innerclasses;

/**
 * Created by lbuthman on 5/21/17.
 */

interface Positive {
    void shine();
    class Negative implements Positive {
        public void shine() {
            System.out.println("A slightly dimmed shine, beautiful and dark.");
        }
        public static void main(String[] args) {
            new Negative().shine();
        }
    }
}

public class Ex20 {

}
