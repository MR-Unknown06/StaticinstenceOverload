
/**
 * Write a description of class intense2int here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Intense2int
{
    
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }

    public static void main(String[] args) {
        Intense2int calculator = new Intense2int();
        int a = 5;
        int b = 7;
        int result = calculator.multiply(a, b);
        System.out.println("The multiplication  of " + a + " and " + b + " is: " + result);
    }
}