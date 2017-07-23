package src.fourth_edition.polymorphism;

import java.util.*;

/**
 * Created by lbuthman on 5/11/17.
 */

interface Rodent {

    void run();
    void eat();
}

class Mouse implements Rodent {
    public Mouse() {
        System.out.println("Mouse #2");
    }
    @Override
    public void run() {
        System.out.println("Mouse: quickly scampers");
    }
    @Override
    public void eat() {
        System.out.println("<nibble nibble nibble>");
    }
}

class Gerbil implements Rodent {
    public Gerbil() {
        System.out.println("Gerbil #3");
    }
    @Override
    public void run() {
        System.out.println("Gerbil: scratches through plastic obstacles");
    }
    @Override
    public void eat() {
        System.out.println("<chomps at tasty nuggets>");
    }
}

class Hamster implements Rodent {
    public Hamster() {
        System.out.println("Hamster #4");
    }
    @Override
    public void run() {
        System.out.println("Hamster: runs very fast but goes no where, damn wheel.");
    }
    @Override
    public void eat() {
        System.out.println("<slowly savors the delicious lobster>");
    }
}

class RandomRodentGenerator {

    Random random = new Random(42);

    public Rodent next() {
        switch (random.nextInt(3)) {
            default:
            case (0): return new Mouse();
            case (1): return new Gerbil();
            case (2): return new Hamster();
        }
    }

}

public class Ex9 {

    private static RandomRodentGenerator generator = new RandomRodentGenerator();

    public static void chase(Rodent rodent) {
        rodent.run();
        System.out.println("(finds food)");
        rodent.eat();
    }

    public static void main(String[] args) {

        Rodent[] rodents = new Rodent[4];

        for (int i=0; i<rodents.length; i++) {
            rodents[i] = generator.next();
        }

        for (Rodent r: rodents) {
            chase(r);
        }
    }
}
