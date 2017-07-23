package src.fourth_edition.experiments;

/**
 * Created by lbuthman on 7/19/17.
 */
public class LabelExample {
    public static void main(String[] args) {

        firstLoop:
        for (int i=0; i<10; i++) {
            System.out.println("Outer Loop: " + i);

            secondLoop:
            for (int j=0; i<20; j++) {
                if (j % 3 == 0) {
                    System.out.println("Inner Loop: " + j);
                } else if (j % 7 == 0) {
                    System.out.println("Lucky Number 7!");
                    continue firstLoop;
                }
            }
        }
    }
}
