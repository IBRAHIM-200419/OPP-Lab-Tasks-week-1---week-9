import java.util.Scanner;

class RemoveCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Remove "b" and "ac" from the string
        String result = str.replace("b", "").replace("ac", "");

        System.out.println("After removing 'b' and 'ac', the new string is: " + result);

        input.close();
    }
}