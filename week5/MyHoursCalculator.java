import java.util.Scanner;

public class MyHoursCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day type (normal/weekend/custom): ");
        String type = scanner.nextLine().toLowerCase();

        DayHoursCalculator calculator;

        if (type.equals("normal")) {
            calculator = new NormalDay();
        } else if (type.equals("weekend")) {
            calculator = new WeekendDay();
        } else if (type.equals("custom")) {
            System.out.print("Enter total hours in custom day: ");
            int total = scanner.nextInt();
            System.out.print("Enter working hours in custom day: ");
            int work = scanner.nextInt();
            calculator = new CustomDay(total, work);
        } else {
            System.out.println("Invalid input. Defaulting to normal day.");
            calculator = new NormalDay();
        }

        System.out.println("Total hours in a day: " + calculator.getTotalHoursInDay());
        System.out.println("Working hours in a day: " + calculator.getWorkingHoursInDay());
    }
}
