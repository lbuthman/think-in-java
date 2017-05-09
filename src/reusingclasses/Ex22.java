package src.reusingclasses;

/**
 * Created by lbuthman on 5/9/17.
 */
final class TheRing {

    String inscription = "One Ring to rule them all, one ring to find them ...";

    public String readInscription() {

        return inscription;
    }

    public String heat() {
        return "(reveals inscription)";
    }
}
/*Doesn't work, sorry Gollum*/
//! class Gollum extends TheRing {}

public class Ex22 {
    public static void main(String[] args) {

        TheRing foundRing = new TheRing();
        System.out.println(foundRing.heat());
        System.out.println(foundRing.readInscription());
    }
}
