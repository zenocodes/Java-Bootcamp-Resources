package sec_3;

public class IfElse {
    public static void main(String[] args) {
        int grade = 65;

        if (grade >= 80) {
            System.out.println("You got an A");
        } else if (grade >= 70) {
            System.out.println("You got a B");
        } else if (grade >= 60) {
            System.out.println("You got a C");
        } else if (grade >= 50) {
            System.out.println("You got an D");
        } else {
            System.out.println("Study hard next time!");
        }
    }
}
