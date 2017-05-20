package src.innerclasses;

/**
 * Created by lbuthman on 5/20/17.
 */

interface Selector {
    boolean end();
    String current();
    void next();
}

public class Ex2 {

    private String[] words;
    private int next = 0;

    public Ex2(int size) { words = new String[size]; }

    void wild() { System.out.println("This is wild.");}

    public void add(String s) {
        if (next < words.length) {
            words[next++] = s;
        }
    }

    public String toString() {

        String wordString = "";

        for (String s: words) {
            wordString += s;
        }

        return wordString;
    }

    private class StringSelector implements Selector {

        private int i = 0;

        public boolean end() { return i == words.length; }

        public String current() { return words[i]; }

        public void next() {
            if (i < words.length) {
                i++;
            }
        }

        public Ex2 outer() {
            return Ex2.this;
        }
    }

    public StringSelector selector() {
        return new StringSelector();
    }

    public static void main(String[] args) {
        Ex2 ex2 = new Ex2(11);

        for (int i=0; i<11; i++) {
            ex2.add(Integer.toString(i));
        }

        StringSelector selector = ex2.selector();

        selector.outer().wild();

        while (!selector.end()) {
            System.out.println(selector.current() + " " + ex2.toString());
            selector.next();
        }

    }
}
