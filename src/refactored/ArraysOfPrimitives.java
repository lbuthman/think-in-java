package src.refactored;

public class ArraysOfPrimitives {

    public static void main(String[] args) {
        int[] arrayInit = { 1, 2, 3, 4, 5 };

        int[] arrayCopy;
        arrayCopy = arrayInit;

        for(int i = 0; i < arrayCopy.length; i++) {
            System.out.println("incrementing copied array value " + arrayCopy[i] + " + 1");
            arrayCopy[i] += 1;
        }

        for(int i = 0; i < arrayInit.length; i++) {
            System.out.println("arrayInit[" + i + "] = " + arrayInit[i]);
        }
    }
}
