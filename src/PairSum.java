import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairSum {
    public static void findPairs(int[] arr, int targetSum) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = targetSum - num;
            if (map.containsKey(complement)) {
                System.out.println("(" + num + ", " + complement + ")");
            }
            map.put(num, 1);
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
        
        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();
        
        findPairs(array, targetSum);
        scanner.close();
    }
}
