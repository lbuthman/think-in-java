package src.holdingyourobjects;

import java.util.ArrayList;

/**
 * Created by lbuthman on 5/21/17.
 */

class Gerbil {
    private int number;

    public Gerbil(int n) {
        this.number = n;
    }

    public void hop() {System.out.println("Gerbil #" + number + " is hopping. Are you happy now?");}
}

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        gerbils.add(new Gerbil(42));
        gerbils.add(new Gerbil(111));
        gerbils.add(new Gerbil(72634));

        for (Gerbil g: gerbils) {
            g.hop();
        }
    }
}
