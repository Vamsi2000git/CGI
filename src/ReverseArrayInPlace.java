import java.util.Scanner;

public class ReverseArrayInPlace {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
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

        System.out.println("Original Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        reverseArray(array);

        System.out.println("\nReversed Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
