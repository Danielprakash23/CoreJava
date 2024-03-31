package example1;
import java.util.Scanner;

public class NumberPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        scanner.close();

        int result = solveNumberPuzzle(number);
        System.out.println("Result: " + result);
    }

    public static int solveNumberPuzzle(int number) {
        if (number < 10 || number > 99) return -1;

        int[] digits = {number / 10, number % 10};
        return (number > 50) ? digits[0] - digits[1] : digits[1] - digits[0];
    }
}

 