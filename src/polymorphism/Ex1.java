package src.polymorphism;

/**
 * Created by lbuthman on 5/10/17.
 */

class Cycle {
    public void ride() {
        System.out.println("Rolling down the street on " + wheels(1) + " wheel(s).");
    }

    public int wheels(int n) {
        return n;
    }
}

class Unicycle extends Cycle {
    //override ride method
    public void ride() {
        System.out.println("Rolling down the street on " + wheels(1) + " wheel unicycle.");
    }
}

class Bicycle extends Cycle {
    //override ride method
    public void ride() {
        System.out.println("Rolling down the street on " + wheels(2) + " wheel bicycle.");
    }
}

class Tricycle extends Cycle {
    //override ride method
    public void ride() {
        System.out.println("Rolling down the street on " + wheels(3) + " wheel tricycle.");
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
