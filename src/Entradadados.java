import java.util.Scanner;

public class Entradadados {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        System.out.println("Enter the student's name: ");
        String nome = nota.nextLine();
        System.out.println("Enter the student’s grade ");
        float grade = nota.nextFloat();
        System.out.println("The grade of " + nome + " is " + grade);

    }
}
