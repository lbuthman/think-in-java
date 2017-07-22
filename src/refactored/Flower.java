package src.refactored;

public class Flower {

    int petalCount = 0;
    String flowerName = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println(
                "Constructor w/ int arg only, petalCount = "
                        + petalCount);
    }
    Flower(String name) {
        System.out.println(
                "Constructor w/ String arg only, flowerName = " + name);
        flowerName = name;
    }
    Flower(String flowerName, int petals) {
        this(petals);
        //- this(flowerName); // Can't call two!
        this.flowerName = flowerName; // Another use of "this"
        System.out.println("flowerName & petals args");
    }
    Flower() {
        this("defaultFlowerName", 47);
        System.out.println("no-arg constructor");
    }
    void printPetalCount() {
        //- this(11); // Not inside non-constructor!
        System.out.println(
                "petalCount = " + petalCount + " flowerName = "+ flowerName);
    }
    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.printPetalCount();
    }
}
