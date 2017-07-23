package src.fourth_edition.interfaces;

/**
 * Created by lbuthman on 5/17/17.
 */

abstract class Number {
    abstract void print();

    public Number() {
        print();
    }
}

class MyNumber extends Number {
    int i = 11;
    void print() {
        System.out.println(i);
    }
}

public class Ex3 {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber();
        myNumber.print();
        //prints 0 when initially called by parent constructor during initialization
        //prints 11 when called from derived class
    }
}
