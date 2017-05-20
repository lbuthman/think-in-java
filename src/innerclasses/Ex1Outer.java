package src.innerclasses;

/**
 * Created by lbuthman on 5/20/17.
 */
public class Ex1Outer {

    //public constructor
    public Ex1Outer() {System.out.println("Sorry, you are on the outside");}

    class Inner {
        //public constructor
        public Inner() {System.out.println("Welcome to the inner circle.");}
    }

    //return reference to Inner class from Outer
    Inner getInside() {
        return new Inner();
    }

    public static void main(String[] args) {
        Ex1Outer outer = new Ex1Outer();
        Ex1Outer.Inner inner = outer.getInside();
    }
}
