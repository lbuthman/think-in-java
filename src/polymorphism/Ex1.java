package src.polymorphism;

/**
 * Created by lbuthman on 5/10/17.
 */

class Cycle {
    public void ride() {
        System.out.println("Rolling down the street");
    }
}

class Unicycle extends Cycle {
    //override ride method
    public void ride() {
        System.out.println("Rolling down the street on my unicycle.");
    }
}

class Bicycle extends Cycle {
    //override ride method
    public void ride() {
        System.out.println("Rolling down the street on my bicycle.");
    }
}

class Tricycle extends Cycle {
    //override ride method
    public void ride() {
        System.out.println("Rolling down the street on my tricycle.");
    }
}

public class Ex1 {
    public static void takeRide(Cycle c) {
        c.ride();
    }

    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();

        takeRide(u);
        takeRide(b);
        takeRide(t);
    }
}
