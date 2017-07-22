package src.refactored;

public class OptionalTrailingArguments {

    static void trailingArgsFunction(int requiredInt, String... trailingString) {

        System.out.print("requiredInt: " + requiredInt + " ");

        for(String s : trailingString)
            System.out.print(s + " ");

        System.out.println();
    }
    public static void main(String[] args) {
        trailingArgsFunction(1, "one");
        trailingArgsFunction(2, "two", "three");
        trailingArgsFunction(0);
    }
}
