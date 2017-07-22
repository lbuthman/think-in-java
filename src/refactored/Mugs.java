package src.refactored;

class Mug {
    Mug(int mugInstance) {
        System.out.println("Mug instance " + mugInstance + " created.");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;
    { // [1]
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }
    Mugs() {
        System.out.println("Default Mugs() instance created");
    }
    Mugs(int mugsInstance) {
        System.out.println("Mugs instance " + mugsInstance + " created.");
    }
    public static void main(String[] args) {
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");
    }
}
