package src.fourth_edition.polymorphism;

/**
 * Created by lbuthman on 5/14/17.
 */

class Characteristic {
    private String s;
    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating Characteristic " + s);
    }
    protected void dispose() {
        System.out.println("disposing Characteristic " + s);
    }
}

class Description {
    private String s;
    Description(String s) {
        this.s = s;
        System.out.println("Creating Description " + s);
    }
    protected void dispose() {
        System.out.println("disposing Characteristic " + s);
    }
}

class LivingCreature {
    private Characteristic characteristic = new Characteristic("is alive.");
    private Description description = new Description("Basic Living Creature");
    LivingCreature() {
        System.out.println("Basic Living Creature.");
    }
    protected void dispose() {
        System.out.println("disposing LivingCreature.");
        description.dispose();
        characteristic.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic characteristic = new Characteristic("has heart.");
    private Description description = new Description("Animal not Vegetable");
    Animal() {
        System.out.println("Animal");
    }
    protected void dispose() {
        System.out.println("disposing Animal");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic characteristic = new Characteristic("can live in water");
    private Description description = new Description("Both water and land");
    Amphibian() {
        System.out.println("Amphibian");
    }
    protected void dispose() {
        System.out.println("disposing Amphibian");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}

class Frog extends Amphibian {
    private Characteristic characteristic = new Characteristic("Croaks");
    private Description description = new Description("Eats bugs");
    public Frog() {
        System.out.println("Frog");
    }
    protected void dispose() {
        System.out.println("disposing Frog");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}

public class Example12 {
    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("bye now");
        frog.dispose();
    }
}
