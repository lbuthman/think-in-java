package src.fourth_edition.innerclasses;

/**
 * Created by lbuthman on 5/21/17.
 */

interface U {
    void stack();
    void that();
    void cheese();
}

class A {
    public U allU = new U() {
        public void stack() {System.out.print("Stack ");}
        public void that() {System.out.print("that ");}
        public void cheese() {System.out.println("cheese.");}
    };
}

class B {
    private int i = 0;
    private U[] yous = new U[5];

    public void setU(U u) {yous[i++] = u;}
    public void nullU(int j) {yous[j] = null;}
    public void allMe() {
        for (U u: yous) {
            if (u != null) {
                u.stack();
                u.that();
                u.cheese();
            }
        }
    }
}

public class Ex23 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
        A a5 = new A();

        B b = new B();

        b.setU(a1.allU);
        b.setU(a2.allU);
        b.setU(a3.allU);
        b.setU(a4.allU);
        b.setU(a5.allU);

        b.nullU(0);
        b.allMe();
    }
}
