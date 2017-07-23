package src.fourth_edition.innerclasses;

/**
 * Created by lbuthman on 5/20/17.
 */

class MandM {

    public class ChocolateCenter {

        public ChocolateCenter() { System.out.println("Inside the thin candy shell."); }
    }
}

public class Ex5 {
    public static void main(String[] args) {

        MandM mm = new MandM();

        MandM.ChocolateCenter yum = mm.new ChocolateCenter();
    }
}
