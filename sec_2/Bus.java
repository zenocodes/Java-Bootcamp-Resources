package sec_2;

public class Bus {
    public static void main(String[] args) {
        String sentence = "Number of passengers: ";
        
        int passengers = 0;
        
        passengers += 9;
        System.out.println(sentence + passengers);

        passengers -= 5;
        System.out.println(sentence + passengers);

        passengers -= 4;
        System.out.println(sentence + passengers);

        System.out.println("End of shift");
    }
}
