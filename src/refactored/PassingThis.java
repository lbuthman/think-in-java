package src.refactored;

class Person {

    void eatApple(Apple apple){
        Apple peeledApple = apple.getPeeled();
        System.out.println("Apple has been pealed and now so Yummy!");
    }
}

class Peeler {

    static Apple peel(Apple apple) {
        System.out.println("(peeler being used on apple)");
        return apple; // Peeled
    }
}

class Apple {

    Apple getPeeled() {
        System.out.println("(providing an apple to peel)");
        return Peeler.peel(this );
    }
}

public class PassingThis {

    public static void main(String [] args) {
        new Person().eatApple(new Apple());
    }
}
