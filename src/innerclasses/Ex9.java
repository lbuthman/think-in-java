package src.innerclasses;

/**
 * Created by lbuthman on 5/20/17.
 */

interface Shoe {
    void tie();
}

class Foot {
    public Shoe prepare(boolean ready) {
        if (ready) {
            class Gear implements Shoe {
                public void tie() {
                    System.out.println("Shoe geared tied on foot.");

                }
            }
            return new Gear();
        } else {
            class Gear implements Shoe {
                public void tie() {
                    System.out.println("Hurry up! We need to go!");

                }
            }
            return new Gear();
        }

    }
}

public class Ex9 {
    public static void main(String[] args) {
        Foot foot = new Foot();
        Boolean ready = true;
        Shoe shoe = foot.prepare(ready);
        shoe.tie();
        Shoe noShoe = foot.prepare(!ready);
        noShoe.tie();
    }
}
