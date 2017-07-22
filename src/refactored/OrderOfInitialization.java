package src.refactored;

class Window {

    Window(int windowInstance) {
        System.out.println("Window instance " + windowInstance + " has been created.");
    }
}

class House {

    Window window1 = new Window(1);

    House () {
        System.out.println("House has been built.");
        window3 = new Window ( 33 );

    } Window window2 = new Window ( 2 );

    void houseFunction() {
        System.out.println("houseFunction()");
    }

    Window window3 = new Window(3);
}

public class OrderOfInitialization {

    public static void main(String[] args) {
        System.out.println("Window instances created before house is built. " +
                "Except Window 33 because it's part of constructor");
        House house = new House();
        house.houseFunction();
    }
}
