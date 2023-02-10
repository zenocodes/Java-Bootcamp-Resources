package sec_6;

public class TDarrays {
    public static void main(String[] args) {
        int[][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };

        for (int i = 0; i < grades[0].length; i++) {
            System.out.print(grades[0][i] +" ");
        }
        System.out.println("\n");

        for (int i = 0; i < grades[1].length; i++) {
            System.out.print(grades[1][i] +" ");
        }
        System.out.println("\n");

        for (int i = 0; i < grades[2].length; i++) {
            System.out.print(grades[2][i] +" ");
        }

    }
}
