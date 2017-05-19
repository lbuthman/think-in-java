package src.interfaces;

/**
 * Created by lbuthman on 5/19/17.
 */

class StringProcessor {
    static int counter = 0;
    final int id = counter++;
    public String toString() {
        return "StringProcessor " + id;
    }
}

class Stringy {

    String crazyString;

    public Stringy(String crazyString) {
        this.crazyString = crazyString;
    }

    public String name() {
        return getClass().getSimpleName();
    }

    public String process() {
        String result = "";
        for (int i=0; i<crazyString.length();) {
            if (i + 1 >= crazyString.length()) {
                result += crazyString.charAt(i);
                break;
            }
            result += crazyString.charAt(i + 1) + "" + crazyString.charAt(i);
            i += 2;
        }
        return result;
    }
}

class StringyAdapter implements Processor {

    Stringy stringy;

    public StringyAdapter(Stringy stringy) {
        this.stringy = stringy;
    }

    public String name() {
        return stringy.name();
    }

    public Object process(Object input) {
        System.out.println(stringy.process());
        return input;
    }
}

public class Ex11 {
    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();
        Apply.process(new StringyAdapter(new Stringy("hi my name is bingo")), sp);

    }
}
