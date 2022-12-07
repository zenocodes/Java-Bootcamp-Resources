import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static Scanner scan = new Scanner(System.in);
    public static String wordToGuess = randomWord(words);
    public static char[] placeHolders = new char[wordToGuess.length()];
    public static String guess = "";
    public static boolean correctGuess;
    public static String misses = "";

    public static void main(String[] args) {

        for (int i = 0; i < wordToGuess.length(); i++) {
            placeHolders[i] = wordToGuess.toCharArray()[i];
        }

        for (int i = 0; i < gallows.length; i++) {
            System.out.println(gallows[i]);
            System.out.print("Word:\t");
            printPlaceholders(placeHolders);

            System.out.println("Misses:\t" + misses);
            System.out.print("\nGuess:\t");
            guess = scan.nextLine();
            correctGuess = checkGuess();
            updatePlaceholders();

            if (placeHolders.equals(wordToGuess.toCharArray())) {
                System.out.print("Word:\t");
                printPlaceholders(placeHolders);
                System.out.println("\nGOOD WORK!");
                System.exit(0);
            }

        }

        System.out.println("\nRIP!");
        System.out.println("The word was: '" + wordToGuess + "'");

        scan.close();
    }

    /**
     * Funtion name: randomWord
     * @param words (String[])
     * @return word (String)
     * 
     * Inside the function
     *  get a random word and return 
     */

    public static String randomWord(String[] words) {
        return words[(int) (Math.random() * words.length)];
    }

    /**
     * Function name: checkGuess
     * @return result (boolean)
     * 
     * Inside the function
     *  return true if the user guessed a letter from the word correctly
     */

    public static boolean checkGuess() {
        return wordToGuess.contains(guess);
    }

    /**
     * Function name: updatePlaceholders
     *  
     * Inside the function
     *  updates the placeholders when the user makes a correct guess.
     */

    public static void updatePlaceholders() {
        if (correctGuess) {
            placeHolders[wordToGuess.indexOf(guess)] = guess.toCharArray()[0];
        } else {
            misses += guess; 
        }
    }

     /**
     * Function name: printPlaceholders
     *  
     * Inside the function
     *  prints the placeholders
     */

    public static void printPlaceholders(char[] word) {
        for (int i = 0; i < word.length; i++) {
            if (word[i] != '_') {
                System.out.print(word[i] + " ");
            } else {
                System.out.print("_ ");
            }
        }
    }

    /**
     * Function name: printMissedGuesses
     *  
     * Inside the function
     *  prints guesses that the user missed.
     */

    public static void printMissedGuesses() {

    }


}





