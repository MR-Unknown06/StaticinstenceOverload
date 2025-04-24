
/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2
{
    
    public int calculateSquare(int number) {
      return number * number;
  }
    public static void main (String [] args){
         Q2 calculate = new Q2();
         int number =8;
         int square =calculate.calculateSquare(number);
         System.out.println("The square of " + number + " is " + square);
   }
}
