package src.refactored;

class Bowl {

    Bowl(int bowlInstance) {
        System.out.println("Bowl instance " + bowlInstance + " created.");
    }

    void bowlFunction(int bowlFunctionMarker) {
        System.out.println("bowlFunction(" + bowlFunctionMarker + ")" );
    }
}

class Table {

    static Bowl bowl1 = new Bowl(1);

    Table() {
        System.out.println("Table has been built.");
        bowl2.bowlFunction(1);
    }

    void tableFunction(int tableFunctionMarker) {
        System.out.println("tableFunction(" + tableFunctionMarker + ")");
    }

    static Bowl bowl2 = new Bowl(2);

}

class Cupboard {

    Bowl bowl3 = new Bowl(3);

    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        System.out.println("Cupboard has been built.");
        bowl4.bowlFunction(2);
    }

    void cupboardFunction(int cupboardFunctionMarker) {
        System.out.println("cupboardFunction(" + cupboardFunctionMarker + ")");
    }

    static Bowl bowl5 = new Bowl(5 );

}

public class StaticInitialization {

    public static void main(String[] args) {

        System.out.println("(to get here, static table and cupboard had to initialized first)\n");
        System.out.println("main creating first Cupboard() finally");

        new Cupboard();

        System.out.println("(to get to the next cupboard, must go through constructors)\n");
        System.out.println("main creating second Cupboard()");

        new Cupboard();

        System.out.println("(now that both cupboards made, can call functions)\n");
        table.tableFunction(1);
        cupboard.cupboardFunction(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
