import java.util.Scanner;

public class ProjectNumber6 {
    public static void main(String[] args) {
        /*
Write a java program to check whether a given number is prime or
not?
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
    }

}

