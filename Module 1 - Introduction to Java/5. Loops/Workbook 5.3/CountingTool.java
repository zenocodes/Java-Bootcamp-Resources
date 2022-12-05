import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // See Learn the Part for the instructions.

        System.out.println("Hi Timmy! Choose a number to count to: ");
        int end = scan.nextInt();

        for (int i = 0; i <= end; i++) {
            System.out.print(i + " ");
        }

        scan.close();
    }
}
