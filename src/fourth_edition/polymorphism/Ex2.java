package src.fourth_edition.polymorphism;

import java.util.*;

/**
 * Created by lbuthman on 5/10/17.
 */

class Shape {
    public void draw(){};
    public void erase(){};
    public void printMessage() { System.out.println("I am your father."); }
}

class Circle extends Shape {
    @Override
    public void draw() { System.out.println("Circle gets the square."); }

    @Override
    public void erase() { System.out.println("Circle die."); }

    @Override
    public void printMessage() { System.out.println("Circle daughter."); }
}

class Triangle extends Shape {
    @Override
    public void draw() { System.out.println("Every triangle has three corners. " +
                                            "Every triangle has three sides.");}

    @Override
    public void erase() { System.out.println("Triangle die."); }
}

class Square extends Shape {
    @Override
    public void draw() { System.out.println("L7 Square."); }

    @Override
    public void erase() { System.out.println("Square die."); }
}

class Rectangle extends Shape {
    @Override
    public void draw() { System.out.println("Rectangle! Not Wreck-Tangle"); }

    @Override
    public void erase() { System.out.println("Rectangle die."); }

    @Override
    public void printMessage() { System.out.println("Rectangle son."); }
}

class RandomShapeGenerator {
    private Random rand = new Random(42);

    public Shape next() {
        switch (rand.nextInt(4)) {
            default:
            case (0): return new Circle();
            case (1): return new Triangle();
            case (2): return new Square();
            case (3): return new Rectangle();
        }
    }
}

public class Ex2 {

    private static RandomShapeGenerator generator = new RandomShapeGenerator();

    public static void main(String[] args) {

        Shape[] shapes = new Shape[9];

        for (int i=0; i<shapes.length; i++) {
            shapes[i] = generator.next();
        }

        for (Shape s: shapes) {
            s.draw();
            s.printMessage();
        }

    }
}
