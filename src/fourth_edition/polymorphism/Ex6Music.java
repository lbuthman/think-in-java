package src.fourth_edition.polymorphism;

import java.util.*;

/**
 * Created by lbuthman on 5/11/17.
 */

//Should be new files in package//

enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

//Should be new files in package//

class Instrument {
    void play(Note note) {
        System.out.println("Instrument.play()");
    }

    @Override
    public String toString() {
        return what();
    }

    String what() {
        return "Instrument";
    }
    void adjust() {
        System.out.println("Adjusting instrument");
    }
}

class Wind extends Instrument {
    void play(Note note) {
        System.out.println("Wind.play() " + note);
    }
    String what() {
        return "Wind";
    }
    void adjust() {
        System.out.println("Adjusting wind");
    }
}

class Percussion extends Instrument {
    void play(Note note) {
        System.out.println("Percussion.play() " + note);
    }
    String what() {
        return "Percussion";
    }
    void adjust() {
        System.out.println("Adjusting percussion");
    }
}

class Stringed extends Instrument {
    void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }
    String what() {
        return "Stringed";
    }
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}

class Brass extends Instrument {
    void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    /*No what() method, so Instrument's gets called*/

    void adjust() {
        System.out.println("Adjusting Brass");
    }
}

class Woodwind extends Instrument {
    void play(Note note) {
        System.out.println("Woodwind.play() " + note);
    }
    String what() {
        return "Woodwind";
    }
}

class Keyboard extends Instrument {
    void play(Note note) {
        System.out.println("Keyboard.play()" + note);
    }
    String what() {
        return "Keyboard";
    }
}

//Should be new files in package//

class RandomInstrumentGenerator {

    private Random random = new Random(42);

    public Instrument next() {
        switch (random.nextInt(6)) {
            default:
            case (0): return new Wind();
            case (1): return new Percussion();
            case (2): return new Stringed();
            case (3): return new Brass();
            case (5): return new Woodwind();
            case (6): return new Keyboard();
        }
    }
}

public class Ex6Music {

    private static RandomInstrumentGenerator generator = new RandomInstrumentGenerator();

    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] instruments) {
        for (Instrument i: instruments) {
            tune(i);
            System.out.println(i.toString());
        }
    }

    public static void main(String[] args) {

        Instrument[] orchestra = new Instrument[20];

        for (int i=0; i<orchestra.length; i++) {
            orchestra[i] = generator.next();
        }

        tuneAll(orchestra);
    }
}
