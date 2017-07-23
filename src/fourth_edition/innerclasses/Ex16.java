package src.fourth_edition.innerclasses;

/**
 * Created by lbuthman on 5/21/17.
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
    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}

class Bicycle implements Cycle {
    public void pedal() {
        System.out.println("Bi moving at 2x pedal speed.");
    }
    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}


class Tricycle implements Cycle {
    public void pedal() {
        System.out.println("Tri moving at 3x pedal speed.");
    }
    public static CycleFactory factory = new CycleFactory() {
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}

public class Ex16 {

    public static void rideCycle(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.pedal();
    }

    public static void main(String[] args) {
        rideCycle(Unicycle.factory);
        rideCycle(Bicycle.factory);
        rideCycle(Tricycle.factory);
    }
}
