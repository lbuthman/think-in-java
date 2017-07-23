package src.fourth_edition.innerclasses;

/**
 * Created by lbuthman on 5/20/17.
 */
public class DotThisExample {

    void f() {
        System.out.println("soup2Function method in DotThisExample class");
    }

    public class Inner {

        public DotThisExample outer() {
            return DotThisExample.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThisExample dte = new DotThisExample();
        DotThisExample.Inner dtei = dte.inner();

        dtei.outer().f();
    }
}
