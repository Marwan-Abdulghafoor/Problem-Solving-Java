package net.murwan;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s){
        if (s.length()%2 != 0){
            return false;
        }

        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==')'){
                if (!stack.isEmpty() && stack.lastElement().equals("(")){
                    stack.pop();
                }else{
                    return false;
                }
            }else if (s.charAt(i)=='}'){
                if (!stack.isEmpty() && stack.lastElement().equals("{")){
                    stack.pop();
                }else{
                    return false;
                }
            }else if (s.charAt(i)==']'){
                if (!stack.isEmpty() && stack.lastElement().equals("[")){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(String.valueOf(s.charAt(i)));
            }
        }
        return stack.isEmpty();

    }
}