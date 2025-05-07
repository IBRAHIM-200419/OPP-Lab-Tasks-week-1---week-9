import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
        int day = scanner.nextInt();
        
        String dayName;
        boolean isWeekend = false;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                isWeekend = true;
                break;
            case 7:
                dayName = "Sunday";
                isWeekend = true;
                break;
            default:
                dayName = "Invalid input";
        }

        if (day >= 1 && day <= 7) {
            System.out.println("The day is: " + dayName);
            System.out.println(isWeekend ? "It's a weekend!" : "It's a weekday.");
        } else {
            System.out.println(dayName);
        }

        scanner.close();
    }
}
