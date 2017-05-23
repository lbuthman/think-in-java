package src.holdingyourobjects;

import java.util.LinkedList;

/**
 * Created by lbuthman on 5/22/17.
 */

class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();
    public void push(T v) { list.addFirst(v);}
    public T peek() {return list.getFirst();}
    public T pop() {return list.removeFirst();}
    public boolean empty() {return list.isEmpty();}
    public String toString() {return list.toString();}
}

public class Ex15 {
    public static void main(String[] args) {
        Stack<String> uncertain = new Stack<>();
        String[] sss = "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—".split("");

        for (int i=0; i<sss.length; i++) {

            switch (sss[i]) {
                case "+":
                    uncertain.push(sss[i + 1]);
                    break;
                case "-":
                    System.out.println(uncertain.pop());

            }
        }

    }
}
