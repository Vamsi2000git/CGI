import java.util.Scanner;
import java.util.Stack;

public class MinStack {
    public static int findSmallestNumber(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        Stack<Integer> stack = new Stack<>();
        int smallest = array[0];

        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }

            stack.push(num);
        }

        return smallest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int smallestNumber = findSmallestNumber(array);

        System.out.println("Smallest Number in the Array: " + smallestNumber);

        scanner.close();
    }
}
