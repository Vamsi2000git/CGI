import java.util.Scanner;
import java.util.Stack;

public class BracketChecker {
    public static boolean areBracketsClosed(String codeSnippet) {
        Stack<Character> stack = new Stack<>();

        for (char c : codeSnippet.toCharArray()) {
            if (isOpeningBracket(c)) {
                stack.push(c);
            } else if (isClosingBracket(c)) {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); 
    }

    public static boolean isOpeningBracket(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isClosingBracket(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    public static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a code snippet: ");
        String codeSnippet = scanner.nextLine();

        boolean result = areBracketsClosed(codeSnippet);
        if (result) {
            System.out.println("All brackets are closed.");
        } else {
            System.out.println("Brackets are not closed properly.");
        }

        scanner.close();
    }
}
