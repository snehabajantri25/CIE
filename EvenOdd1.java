import java.util.Scanner;

public class EvenOdd1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even number(master branch).");
        } else {
            System.out.println(number + " is odd number.");
        }

        scanner.close();
    }
}