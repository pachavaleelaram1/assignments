import java.util.Scanner;

public class SmallLargeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            System.out.println(num1 + " is smaller");
            System.out.println(num2 + " is larger");
        } else if (num1 > num2) {
            System.out.println(num2 + " is smaller");
            System.out.println(num1 + " is larger");
        } else {
            System.out.println("Both numbers are equal");
        }

        scanner.close();
    }
}
