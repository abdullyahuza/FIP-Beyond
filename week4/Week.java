// Enum representing days of the week
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Superclass that contains and displays the days
class Week {
    protected Day[] days;

    public Week() {
        days = Day.values();
    }

    public void displayDays() {
        System.out.println("Days of the week:");
        for (Day day : days) {
            System.out.println("- " + day);
        }
    }

    // Static nested class
    public static class Message {
        public static void showGreeting() {
            System.out.println("\nWelcome to the Week Viewer App!");
        }
    }

    // Non-static inner class
    public class DayInfo {
        public void printDayType(Day day) {
            if (day == Day.SATURDAY || day == Day.SUNDAY) {
                System.out.println(day + " is a weekend.");
            } else {
                System.out.println(day + " is a weekday.");
            }
        }
    }
}