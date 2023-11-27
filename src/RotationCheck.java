import java.util.Scanner;

public class RotationCheck {
    public static boolean areRotations(String str1, String str2) {
        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        String concatenated = str1 + str1;

        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        if (areRotations(s1, s2)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }

        scanner.close();
    }
}
