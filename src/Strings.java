public class Strings {

    public static void main(String[] args) {

        String name = "Carol";
        String nameTwo = "Ester";
        String surname = "Torres";

        int sizeString = name.length(); // to count the characters of the string
        boolean sameName = name.equals(nameTwo);
        String fullName = name.concat(surname); // to join two words


        System.out.println("Hello, "+ name.toUpperCase() );
        System.out.println("Your name has " + sizeString + " characters");
        System.out.println("Are the names equals? " +sameName);
        System.out.println("Full name: " + fullName);

    }
}
