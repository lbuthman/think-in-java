package src.holdingyourobjects;

import java.util.HashMap;
import java.util.Iterator;

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
        HashMap<String,Gerbil> gerbils = new HashMap<>();
        gerbils.put("fuzzy", new Gerbil(42));
        gerbils.put("goofy", new Gerbil(111));
        gerbils.put("slappy", new Gerbil(72634));

        Iterator<String> it = gerbils.keySet().iterator();

        while (it.hasNext()) {
            Gerbil g = gerbils.get(it.next());
            g.hop();
        }
    }
}
