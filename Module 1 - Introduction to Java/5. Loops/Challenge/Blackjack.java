import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        //Task 3 – Wait for the user to press enter.
        scan.nextLine();

        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        int yourRandomNum1 = drawRandomCard();
        int yourRandomNum2 = drawRandomCard();

        System.out.println("\n You get a \n" + cardString(yourRandomNum1) + "\n and a \n" + cardString(yourRandomNum2));

        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>

        int yourTotal = Math.min(yourRandomNum1, 10) + Math.min(yourRandomNum2, 10);
        System.out.println("Your total is: " + yourTotal);

        
        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden

        int dealersRandomCardNum1 = drawRandomCard();
        int dealersRandomCardNum2 = drawRandomCard();

        System.out.println("The dealer shows \n" + cardString(dealersRandomCardNum1) + "\nand has a card facing down \n" + faceDown());

        int dealersTotal = Math.min(dealersRandomCardNum1, 10) + Math.min(dealersRandomCardNum2, 10);
        System.out.println("\nThe dealer's total is hidden");

       
        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 

        while (true) {
            String prompt = hitOrStay();

            if (prompt.equals("stay")) {
                break;
            }

            if (yourTotal > 21) {
                System.out.println("Bust! Player loses");
                System.exit(0);
            } else {
                int yourNewRandomNum = drawRandomCard();
                System.out.println("You get a \n" + cardString(yourNewRandomNum));
                yourTotal += yourNewRandomNum;
                System.out.println("Your new total is " + yourTotal);
            }
            
        }

        System.out.println("\nDealer's turn");
        System.out.println("\nThe dealer's cards are " + cardString(dealersRandomCardNum1) + "\nand a \n" + cardString(dealersRandomCardNum2));

        while (true) {

            if (dealersTotal > 21) {
                System.out.println("Bust! Dealer loses");
                System.exit(0);
            } else if (dealersTotal >= 17) {
                break;
            } else {
                int dealersNewRandomCardNum = drawRandomCard();
                System.out.println("Dealer gets a \n" + cardString(dealersNewRandomCardNum));
                dealersTotal += dealersNewRandomCardNum;
                System.out.println("Dealer's total is " + dealersTotal);

                if (yourTotal > dealersTotal) {
                    System.out.println("Player wins!");
                } else {
                    System.out.println("Dealer wins!");
                }

            }
            
        }



        
        //For tasks 9 to 13, see the article: Blackjack Part II. 
         scan.close();

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */

     public static int drawRandomCard() {
        return (int) Math.random() * 13 + 1;
     }

    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */

     public static String cardString(int cardNumber) {
        String card = "";
        switch (cardNumber) {
            case 1: 
                card =  "   _____\n"+
                        "  |A _  |\n"+ 
                        "  | ( ) |\n"+
                        "  |(_'_)|\n"+
                        "  |  |  |\n"+
                        "  |____V|\n";
                break;

            case 2:
                card =  "   _____\n"+              
                        "  |2    |\n"+ 
                        "  |  o  |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____Z|\n";
                break;

            case 3: 
                card =  "   _____\n" +
                        "  |3    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  |  o  |\n"+
                        "  |____E|\n";
                break;

            case 4:
                card =  "   _____\n" +
                        "  |4    |\n"+
                        "  | o o |\n"+
                        "  |     |\n"+
                        "  | o o |\n"+
                        "  |____h|\n";
                break;

            case 5:
                card =  "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";
                break;

            case 6:
                card =  "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";
                break;

            case 7: 
                card =  "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";
                break;

            case 8:
                card =  "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
                break;

            case 9:
                card =  "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";
                break;

            case 10:
                card =  "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
                break;

            case 11:
                card =  "   _____\n" +
                        "  |J  ww|\n"+ 
                        "  | o {)|\n"+ 
                        "  |o o% |\n"+ 
                        "  | | % |\n"+ 
                        "  |__%%[|\n";
                break;

            case 12:
                card =  "   _____\n" +
                        "  |Q  ww|\n"+ 
                        "  | o {(|\n"+ 
                        "  |o o%%|\n"+ 
                        "  | |%%%|\n"+ 
                        "  |_%%%O|\n";
                break;

            case 13:
                card =  "   _____\n" +
                        "  |K  WW|\n"+ 
                        "  | o {)|\n"+ 
                        "  |o o%%|\n"+ 
                        "  | |%%%|\n"+ 
                        "  |_%%%>|\n";
                break;

        
            default:
                System.out.println("INVALID CARD.");
                System.exit(0);
                break;
        }
        return card;
     }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    public static String hitOrStay() {
        String response = "";
        while (!response.equals("hit") || !response.equals("stay")) {
            System.out.println("Please write 'hit' or 'stay': ");
        }
        return response;
    }
}

