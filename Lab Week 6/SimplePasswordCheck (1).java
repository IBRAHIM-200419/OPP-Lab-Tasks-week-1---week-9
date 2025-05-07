import java.util.Scanner;

public class SimplePasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        int upperCount = 0;
        int lowerCount = 0;
        int digitCount = 0;

        if (password.length() < 6) {
            System.out.println("Password must be at least 6 characters long.");
        } else {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) {
                    upperCount++;
                }
                if (Character.isLowerCase(ch)) {
                    lowerCount++;
                }
                if (Character.isDigit(ch)) {
                    digitCount++;
                }
            }

            if (upperCount == 0) {
                System.out.println("Password must have at least one uppercase letter.");
            }
            if (lowerCount == 0) {
                System.out.println("Password must have at least one lowercase letter.");
            }
            if (digitCount == 0) {
                System.out.println("Password must have at least one number.");
            }

            if (upperCount > 0 && lowerCount > 0 && digitCount > 0) {
                System.out.println("Password is valid.");
            }
        }

        input.close();
    }
}
