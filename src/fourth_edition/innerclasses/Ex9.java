package src.fourth_edition.innerclasses;

/**
 * Created by lbuthman on 5/20/17.
 */

interface Shoe {
    void tie();
}

class Foot {
    public Shoe prepare(final boolean ready) {

        return new Shoe() {

            public void tie() {
                if (ready) {
                    System.out.println("Shoe tied. Let's do this!");
                } else {
                    System.out.println("Where is my shoe???");
                }
            }
        };

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
