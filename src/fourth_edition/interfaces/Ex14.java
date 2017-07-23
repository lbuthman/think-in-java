package src.fourth_edition.interfaces;

/**
 * Created by lbuthman on 5/20/17.
 */

interface Mouth {
    void laugh();
    void shout();
}

interface Eyes {
    void wink();
    void squint();
}

interface Ears {
    void listen();
    void ignore();
}

interface Sense extends Mouth, Eyes, Ears {
    void detect();
}

abstract class Person {
    String type;
    public Person(String type) {
        this.type = type;
        System.out.println("I'm a " + type);
    }
    public Person() {}
}

class Ninja extends Person implements Sense {

    String type;

    public Ninja(String type) {
        this.type = type;
        System.out.println("I'm a " + type);
    }

    public void detect() {
        System.out.println("I feel your presence.");
    }
    public void laugh() {
        System.out.println("I'm a ninja, it's my birthday.");
    }
    public void shout() {
        System.out.println("Just throw the cake up here please!!");
    }
    public void wink() {
        System.out.println("I can jump roof to roof, giving my friends free cable. It's bad ass.");
    }
    public void squint() {
        System.out.println("Like the shadow serpent, silence is my veil.");
    }
    public void listen() {
        System.out.println("We must go out and ninja in the night.");
    }
    public void ignore() {
        System.out.println("With precision of the cobra, ninja's kill and leave no trail.");
    }
}

public class Ex14 {
    public static void sensing(Sense sense) { sense.detect(); }
    public static void laughing(Mouth mouth) { mouth.laugh(); }
    public static void shouting(Mouth mouth) { mouth.shout(); }
    public static void squinting(Eyes eyes) { eyes.squint(); }
    public static void winking(Eyes eyes) { eyes.wink(); }
    public static void listening(Ears ears) { ears.listen(); }
    public static void ignoring(Ears ears) { ears.ignore(); }

    public static void main(String[] arg) {
        Ninja ninja = new Ninja("Ninja");
        sensing(ninja);
        laughing(ninja);
        shouting(ninja);
        listening(ninja);
        squinting(ninja);
        ignoring(ninja);
        winking(ninja);
    }
}
