package src.refactored;

class Cup {

    Cup(int cupInstance) {
        System.out.println("Single Cup instance " + cupInstance + " created.");
    }
    void cupFunction(int cupFunctionMarker) {
        System.out.println("cupFunction(" + cupFunctionMarker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        System.out.println("Multiple Cups, but will not be called since not constructed in main()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Printing from inside main()");
        System.out.println("static cup1 and cup2 inside Cups are created, then there is a call to the cup function");
        Cups.cup1.cupFunction(99);  // [1]
    }
    // static Cups cups1 = new Cups();  // [2]
    // static Cups cups2 = new Cups();  // [2]
}
