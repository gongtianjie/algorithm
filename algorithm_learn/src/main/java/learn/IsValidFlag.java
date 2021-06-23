package learn;

import java.util.Stack;

public class IsValidFlag {

    public static void main(String[] args) {

        Stack<Character> stack = new Stack<Character>();
        stack.push('}');
        String s="[}";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c==stack.peek()){
                System.out.println(false);
            }
        }

    }
}
