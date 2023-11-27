import java.util.Scanner;
import java.util.Stack;

public class PrefixToInfix {
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static String convertPrefixToInfix(String prefix) {
        Stack<String> stack = new Stack<>();

        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else if (isOperator(c)) {
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String expression = "(" + operand1 + c + operand2 + ")";
                stack.push(expression);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a prefix expression: ");
        String prefixExpression = scanner.nextLine();

        String infixExpression = convertPrefixToInfix(prefixExpression);
        System.out.println("Infix Expression: " + infixExpression);

        scanner.close();
    }
}
