package src.innerclasses;

/**
 * Created by lbuthman on 5/21/17.
 */

interface Breakfast {
    void prize();
}

class Box {
    private static class Cereal implements Breakfast {
        public void prize() { System.out.println("You found a decoder ring!"); }
    }

    public static Cereal makeCereal() {
        return new Cereal();
    }
}

public class Ex18 {
    public static void main(String[] args) {
        Breakfast cereal = Box.makeCereal();
        cereal.prize();
    }
}
