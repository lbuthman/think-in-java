package src.fourth_edition.reusingclasses;

/**
 * Created by lbuthman on 5/8/17.
 */

class WithFinals {

    private final void f() {
        System.out.println("Class: WithFinals, Method: soup2Function()");
    }

    private void g() {
        System.out.println("Class: WithFinals, Method: g()");
    }
}

/* Using Override helps us as Programmers by throwing a compile time error instead
of getting surprised with a runtime error. There is nothing to override because the
above methods are private (final is redundant)

class OverrideFinals extends  WithFinals {

    @Override
    private final void soup2Function() {
        System.out.println("Class: OverrideFinals, Method: soup2Function()");
    }

    @Override
    private final void g() {
        System.out.println("Class: OverrideFinals, Method: g()");
    }
}*/

public class Ex20 {
    public static void main(String[] args) {

        WithFinals wf = new WithFinals();
//        wf.soup2Function();
//        wf.g();
        System.out.println("nothing to see here ...");
    }
}
