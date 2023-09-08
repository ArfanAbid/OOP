import java.util.Scanner;

public class Exception{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter a string: ");
                String userInput = scanner.nextLine();

                if (!userInput.matches("[a-zA-Z]+")) {
                    throw new IllegalArgumentException("Please enter a string value.");
                }

                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        // Continue with the rest of your code here
    }
}

//System.out.print("Enter the name of the author: ");
//        String addAuthor = null;
//        boolean validInput = false;
//
//        while (!validInput) {
//        try {
//        addAuthor = sc.nextLine();
//        Integer.parseInt(addAuthor); // Check if the input is an integer
//        System.out.println("Please enter a valid author name (not an integer).");
//        } catch (NumberFormatException e) {
//        validInput = true;
//        }
//        }
//



