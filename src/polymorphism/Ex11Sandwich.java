package src.polymorphism;

import com.sun.tools.internal.ws.wsdl.document.Port;

/**
 * Created by lbuthman on 5/13/17.
 */

class Meal {
    public Meal() {System.out.println("Meal()");}
}

class Bread {
    public Bread() {System.out.println("Bread()");}
}

class Cheese {
    public Cheese() {System.out.println("Cheese()");}
}

class Lettuce {
    public Lettuce() {System.out.println("Lettuce()");}
}

class Pickle {
    public Pickle() {System.out.println("Pickle()");}
}

class Lunch extends Meal {
    public Lunch() {System.out.println("Lunch()");}
}

class PortableLunch extends Lunch {
    public PortableLunch() {System.out.println("Portable Lunch()");}
}

interface FastFood {
    void pickup();
    void driveThrough();
}

public class Ex11Sandwich extends PortableLunch implements FastFood {
    Bread bread = new Bread();
    Cheese cheese = new Cheese();
    Lettuce lettuce = new Lettuce();
    Pickle pickle = new Pickle();
    public Ex11Sandwich() {System.out.println("Ex11Sandwich()");}

    public void pickup() {
        System.out.println("Here is your Hamburger Sandwich.");
    }

    public void driveThrough() {
        System.out.println("Please pull around.");
    }

    public static void main(String[] args) {
        Ex11Sandwich sandwich = new Ex11Sandwich();
        sandwich.driveThrough();
        sandwich.pickup();
    }
}
