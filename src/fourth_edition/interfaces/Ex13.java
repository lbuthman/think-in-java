package src.fourth_edition.interfaces;

/**
 * Created by lbuthman on 5/19/17.
 */

interface IOne {
    void omg();
}

interface ITwo extends IOne {
    void omg();
}

interface IThree extends IOne {
    void omg();
}

interface IFour extends ITwo {
    void omg();
}

class SoOMG implements IOne, ITwo, IThree, IFour {
    public void omg() {
        System.out.println("omg");
    };
}

public class Ex13 {

    public static void howExciting(SoOMG x) { x.omg(); }

    public static void main(String[] args) {

        SoOMG soOMG = new SoOMG();
        for (int i=0; i<4; i++) {
            howExciting(soOMG);
        }
    }
}
