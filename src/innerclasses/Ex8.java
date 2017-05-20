package src.innerclasses;

/**
 * Created by lbuthman on 5/20/17.
 */
public class Ex8 {

    public class InnerEx8 {
        private String hi = "hi";
    }

    public void canYouSayHi() {

        // no direct access, have to create instance
        //System.out.println(hi);

        InnerEx8 inner = new InnerEx8();
        System.out.println(inner.hi);
    }

    public static void main(String[] args) {
        Ex8 ex8 = new Ex8();
        ex8.canYouSayHi();
    }
}
