package collections.stacks;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Stack;

public class stacksClass {
    public static void main(String[] args) {
        Stack<String> strStack = new Stack<>();
        strStack.push("one");
        strStack.push("two");
        strStack.push("three");
        strStack.push("four");

        System.out.println(strStack);
        System.out.println(strStack.pop());
        System.out.println(strStack);
        System.out.println(strStack.peek());
        System.out.println(strStack);

    }

    @Test
    public void isPalindrome(){
        LinkedList<Character> stack = new LinkedList<>();
        String check = " race , cars";

        String checkNlowercase = check.toLowerCase();
        StringBuilder checkNoPunct = new StringBuilder(checkNlowercase.length());
        for (int i=0; i<check.length();i++){
            char c= check.charAt(i);
            if(c>='a'&&c<='z'){
                checkNoPunct.append(c);
                stack.push(c);
            }
        }
        System.out.println(checkNoPunct);
        StringBuilder reverse = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reverse =reverse.append(stack.pop());
        }
        System.out.println(reverse);


    }






}
