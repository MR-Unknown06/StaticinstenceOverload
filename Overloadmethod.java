
/**
 * Write a description of class overloadmethod here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Overloadmethod {
    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println(num + " is the Positive.");
        } else if (num < 0) {
            System.out.println(num + " is the  Negative.");
        } else {
            System.out.println(num + " is the Zero.");
        }
    }
    public static void checkNumber(int num, String type) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }
    public static void main(String[] args) {
        int number = 17;
        checkNumber(number); 
        checkNumber(number, "evenOrOdd");  
    }
}