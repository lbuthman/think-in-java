package src.fourth_edition.interfaces;

/**
 * Created by lbuthman on 5/19/17.
 */

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

class ActionCharacter {
    public void fight() {
        System.out.println("Fighting skill depends on hero");
    }
}

class Hero extends ActionCharacter
    implements CanFight, CanSwim, CanFly, CanClimb {

    public void swim() {
        System.out.println("Hero can swim real far.");
    }
    public void fly() {
        System.out.println("Hero can fly real high.");
    }

    public void climb() {
        System.out.println("Hero can climb real high.");
    }
}

public class Ex12 {
    public static void upcastFight(CanFight x) { x.fight(); }
    public static void upcastSwim(CanSwim x) { x.swim(); }
    public static void upcastFly(CanFly x) { x.fly(); }
    public static void upcastClimb(CanClimb x) { x.climb(); }
    public static void fighter(ActionCharacter x) { x.fight(); }

    public static void main(String[] args) {
        Hero hero = new Hero();
        upcastFight(hero);
        upcastSwim(hero);
        upcastFly(hero);
        upcastClimb(hero);
        fighter(hero);
    }
}
