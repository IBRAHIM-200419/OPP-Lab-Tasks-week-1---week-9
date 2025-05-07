import java.util.Scanner;

class EmployeeEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer employees = new StringBuffer();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            employees.append(name).append(" - ").append(email).append("\n");
        }

        System.out.println("\nEmployee Details:");
        System.out.println(employees);

        scanner.close();
    }
}
