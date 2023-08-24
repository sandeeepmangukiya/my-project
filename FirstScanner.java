import java.util.Scanner; // Import the Scanner class

public class FirstScanner {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a Username");

        String userName = myObj.nextLine(); // Read user input
        System.out.println("The Username is: " + userName); // Output user input
    }
}
