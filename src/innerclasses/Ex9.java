package src.innerclasses;

/**
 * Created by lbuthman on 5/20/17.
 */

interface Shoe {
    void tie();
}

class Foot {
    public Shoe prepare() {
        class Gear implements Shoe {
            public void tie() {
                System.out.println("Shoe geared tied on foot.");

            }
        }

        return new Gear();
    }
}

public class Ex9 {
    public static void main(String[] args) {
        Foot foot = new Foot();
        Shoe shoe = foot.prepare();
        shoe.tie();
    }
}
