package src.fourth_edition.interfaces;

/**
 * Created by lbuthman on 5/20/17.
 */

interface Cycle {
    void pedal();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    public void pedal() {
        System.out.println("Uni moving at 1x pedal speed.");
    }
}

class UniCycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {
    public void pedal() {
        System.out.println("Bi moving at 2x pedal speed.");
    }
}

class BicycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {
    public void pedal() {
        System.out.println("Tri moving at 3x pedal speed.");
    }
}

class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }
}

public class Ex18 {

    public static void rideCycle(CycleFactory cycleFactory) {
        Cycle c = cycleFactory.getCycle();
        c.pedal();
    }

    public static void main(String[] args) {
        rideCycle(new UniCycleFactory());
        rideCycle(new BicycleFactory());
        rideCycle(new TricycleFactory());
    }
}
