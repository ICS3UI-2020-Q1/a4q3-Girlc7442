import java.util.Scanner;

/**
 * Calculates the sum from 1 to the user number
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user to enter a positive integer
    System.out.println("Please enter an integer to count down to");
    int userNumber = input.nextInt();

    //to keep the original user number for the closing statement
    int userNumber2 = userNumber;
    
    //the start of the accumulator
    int sum = 0;
    //the accumulator
    int sum2 = 1;
    //will loop until the userNumber reaches 0
    while(userNumber != 0){
      sum = sum + sum2;
      sum2 = sum2 + 1;
      userNumber = userNumber - 1;
    }
    //Prints the final sum to the screen
    System.out.println("The sum from 1 - " + userNumber2 + " is " + sum);
  }
}
