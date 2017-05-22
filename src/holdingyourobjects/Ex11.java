package src.holdingyourobjects;

import java.util.*;

/**
 * Created by lbuthman on 5/22/17.
 */

class Pillow {
    private String type;
    public Pillow(String t) {this.type = t;}

    public static Pillow makePillow() {
        Random random = new Random(42);
        switch (random.nextInt(4)) {
            default:
            case 0:
                return new Pillow("fluffy");
            case 1:
                return new Pillow("hard");
            case 2:
                return new Pillow("body");
            case 3:
                return new Pillow("throw");
        }
    }

    public String toString() {return "This pillow is a " + type + " pillow.";}
}

public class Ex11 {
    public static void display(Iterator<Pillow> it) {
        while (it.hasNext()) {
            Pillow p = it.next();
            System.out.println(p.toString());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    public static void main(String[] args) {
        Pillow[] pillows = new Pillow[5];
        for (int i=0; i<pillows.length; i++) {
            pillows[i] = Pillow.makePillow();
        }
        ArrayList<Pillow> pillAL = new ArrayList<>(Arrays.asList(pillows));
        LinkedList<Pillow> pillLL = new LinkedList<>(pillAL);
        HashSet<Pillow> pillHS = new HashSet<>(pillAL);
        //TreeSet<Pillow> pillTS = new TreeSet<Pillow>(pillAL);

        display(pillAL.iterator());
        display(pillLL.iterator());
        display(pillHS.iterator());
        //display(pillTS.iterator());
    }
}
