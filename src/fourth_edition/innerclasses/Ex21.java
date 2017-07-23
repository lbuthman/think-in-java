package src.fourth_edition.innerclasses;

/**
 * Created by lbuthman on 5/21/17.
 */

interface Drink {
    void stir();
    void sip();
    class Martini {

        public static void enjoy(Drink drink) {
            drink.stir();
            drink.sip();
        }
    }
}

public class Ex21 implements Drink {
    public void stir() {System.out.println("Please shake, never stir.");}
    public void sip() {System.out.println("Fancy sip.");}
    public static void main(String[] args) {

        Martini.enjoy(new Ex21());

    }
}
