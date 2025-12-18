
import java.util.Stack;

public class Main {

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char open = stack.pop();
                if (!matches(open, ch)) return false;
            }
        }

        return stack.isEmpty();
    }


    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')')
            || (open == '{' && close == '}')
            || (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String[] tests = {
            "{(})",      
            "()[{}]",    
            "([)]",      
            "{[()()]}", 
            "(((",       
            "abc{x}"
        };

        for (String s : tests) {
            System.out.println(s + " -> " + isBalanced(s));
        }
    }
}
