package src.refactored;

class Soup1 {

    private Soup1() {}

    public static Soup1 makeSoup() { // [1]
        return new Soup1();
    }
}

class Soup2 {

    private Soup2() {}

    private static Soup2 soup2 = new Soup2(); // [2]

    public static Soup2 accessPrivateClassInstance() {
        return soup2;
    }
    public void soup2Function() {}
}

// Only one public class allowed per file:
public class Lunch {

    void testPrivate() {
        // Can't do this! Private constructor:
        //- Soup1 soup = new Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.accessPrivateClassInstance().soup2Function();
    }
}
