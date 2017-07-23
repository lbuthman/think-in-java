package src.fourth_edition.interfaces;

/**
 * Created by lbuthman on 5/17/17.
 */

/*Actually this works!*/
abstract class NoMethod {

}

public class Ex2 {
    public static void main(String[] args) {
        NoMethod no = new NoMethod() {};
        System.out.println(no);
    }
}
