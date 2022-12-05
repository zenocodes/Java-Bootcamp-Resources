import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
       
       //See Learn the Part for detailed instructions.

       int secretNumber = (int) Math.random() * 4 + 1;
       int guess = scan.nextInt();

       while (guess != secretNumber) {
            System.out.println("Guess again: ");
            guess = scan.nextInt();
       }

       System.out.println("You got it!");
        

        
        scan.close();
    }

}
