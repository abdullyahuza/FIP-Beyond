// Main class
public class DaysOfWeekDemo {
    public static void main(String[] args) {
        // Calling static showGreeting method from static nested class
        Week.Message.showGreeting();

        // Create instance of subclass (ExtendedWeek)
        ExtendedWeek extendedWeek = new ExtendedWeek();
        extendedWeek.displayDays();        // From superclass
        extendedWeek.displayWeekend();     // From subclass

        // Instantiate inner class using outer class instance
        Week.DayInfo dayInfo = extendedWeek.new DayInfo();

        System.out.println("\nDay Types:");
        for (Day day : Day.values()) {
            dayInfo.printDayType(day);
        }
    }
}