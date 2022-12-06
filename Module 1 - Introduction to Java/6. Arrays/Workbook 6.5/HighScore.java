public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).

        int[] randomNumbers = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};


        System.out.print("Here are the scores: ");

        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(" " + randomNumbers[i] + " ");
            highScore = Math.max(highScore, randomNumbers[i]);
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

        
        
    }    

    /**
    *  Function name - randomNumber
    *  @return (int)
    *
    *  Inside the function
    *    - returns a random number between 0 to 49999
    *
    */

    public static int randomNumber() {
        return (int) Math.random() * 50000;
    }

}
