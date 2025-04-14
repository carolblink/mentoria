import java.util.Scanner;

import static java.lang.System.in;

public class Conditionalstructure {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);
        System.out.print("First grade: ");
        float n1 = keyboard.nextFloat();
        System.out.print("Second grade: ");
        float n2 = keyboard.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println("Your average was " + m);
        if (m > 9) System.out.println("Congratulations!");
    }
}
