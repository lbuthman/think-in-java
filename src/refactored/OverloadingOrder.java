package src.refactored;

public class OverloadingOrder {

    static void sameStaticFunction(String stringFirst, int intSecond) {
        System.out.println("String: " + stringFirst + " int: " + intSecond);
    }

    static void sameStaticFunction(int intFirst, String stringSecond) {
        System . out . println ( "int: " + intFirst + ", String: " + stringSecond);
    }

    public static void main ( String [] args) {

        sameStaticFunction("String first" , 11 );

        sameStaticFunction(99 , "Int first" ); }
}
