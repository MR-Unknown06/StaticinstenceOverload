
/**
 * Write a description of class Factorail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial {
    public static void displayFactorial(int num) {
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}