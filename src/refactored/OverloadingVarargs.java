package src.refactored;

public class OverloadingVarargs {

    static void argsCharFunction(Character... args) {
        System.out.println("Char args function called");
        for(Character c : args)
            System.out.print("\tchar: " + c + " ");
        System.out.println();
    }

    static void argsCharFunction(Integer... args) {
        System.out.println("Integer args function called");
        for(Integer i : args)
            System.out.print("\tInteger " + i);
        System.out.println();
    }

    static void argsCharFunction(Long... args) {
        System.out.println("Long args function called");
    }

    public static void main(String[] args) {
        argsCharFunction('a', 'b', 'c');
        argsCharFunction(1);
        argsCharFunction(2, 1);
        argsCharFunction(0);
        argsCharFunction(0L);
        //- argsCharFunction(); // Won't compile -- ambiguous
    }
}
