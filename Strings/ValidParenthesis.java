package Strings;

import java.util.ArrayList;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{}]";
        boolean res = validParenthesis(s);
        System.out.println(res ? "valid" : "Not valid");
    }

    public static boolean validParenthesis(String s) {

        ArrayList<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.add(s.charAt(i));
            }

            if (stack.size() != 0) {
                if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                    if (s.charAt(i) == ')' && stack.get(stack.size() - 1) == '('
                            || s.charAt(i) == ']' && stack.get(stack.size() - 1) == '['
                            || s.charAt(i) == '}' && stack.get(stack.size() - 1) == '{') {
                        stack.remove(stack.size() - 1);
                    } else
                        return false;
                }

            } else
                return false;
        }
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}