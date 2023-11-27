import java.util.Scanner;
import java.util.Stack;

public class ReverseingStack {
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter the elements of the stack:");
        for (int i = 0; i < size; i++) {
            stack.push(scanner.nextInt());
        }

        System.out.println("Original Stack: " + stack);

        Stack<Integer> reversedStack = new Stack<>();
        while (!stack.isEmpty()) {
            reversedStack.push(stack.pop());
        }

        System.out.println("Reversed Stack: " + reversedStack);

        scanner.close();
    }
}
