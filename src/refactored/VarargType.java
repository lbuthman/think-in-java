package src.refactored;

public class VarargType {

    static void objectArgsFunction(Character... args) {
        System.out.print(args.getClass());
        System.out.println(" args length " + args.length);
    }

    static void primitiveArgsFunction(int... args) {
        System.out.print(args.getClass());
        System.out.println(" args length " + args.length);
    }

    public static void main(String[] args) {
        objectArgsFunction('a');
        objectArgsFunction();

        primitiveArgsFunction(1);
        primitiveArgsFunction();

        System.out.println("array int[]: " + new int[0].getClass());
    }
}
