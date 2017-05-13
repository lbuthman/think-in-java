package src.polymorphism;

/**
 * Created by lbuthman on 5/13/17.
 */

class Dude {

    public void bowl() {
        abide();
    }

    public void abide() {
        System.out.println("The dude abides.");
    }
}

class Lebowski extends Dude {

    @Override
    public void abide() {
        System.out.println("I'm not Lebowski man. I'm the dude.");
    }
}

public class Ex10 {
    public static void main(String[] args) {
        Dude theDude = new Lebowski();
        theDude.bowl();
    }
}
