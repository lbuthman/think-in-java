package src.innerclasses;

/**
 * Created by lbuthman on 5/20/17.
 */
public class Ex1Outer {

    private String member;

    //public constructor
    public Ex1Outer(String s) {
        this.member = s;
        System.out.println("Sorry, you are on the outside");
    }

    class Inner {
        //public constructor
        public Inner() {System.out.println("Welcome to the inner circle.");}

        public String toString() {
            return member;
        }
    }

    //return reference to Inner class from Outer
    Inner getInside() {
        return new Inner();
    }

    public static void main(String[] args) {
        Ex1Outer outer = new Ex1Outer("trial basis");
        Ex1Outer.Inner inner = outer.getInside();
        System.out.println("Your membership status is " + inner.toString());
    }
}
