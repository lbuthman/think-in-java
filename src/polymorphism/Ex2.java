package src.polymorphism;

import java.util.*;

/**
 * Created by lbuthman on 5/10/17.
 */

class Shape {
    public void draw(){};
    public void erase(){};
}

class Circle extends Shape {
    @Override
    public void draw() { System.out.println("Circle gets the square."); }

    @Override
    public void erase() { System.out.println("Circle die."); }
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

class RandomeShapeGenerator {
    private Random rand = new Random(42);

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case (0): return new Circle();
            case (1): return new Triangle();
            case (2): return new Square();
        }
    }
}

public class Ex2 {

    private static RandomeShapeGenerator generator = new RandomeShapeGenerator();

    public static void main(String[] args) {

        Shape[] shapes = new Shape[9];

        for (int i=0; i<shapes.length; i++) {
            shapes[i] = generator.next();
        }

        for (Shape s: shapes) {
            s.draw();
        }

    }
}
