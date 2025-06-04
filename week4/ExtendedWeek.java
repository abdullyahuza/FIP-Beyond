// Subclass that extends Week and adds extra behavior
class ExtendedWeek extends Week {

    public ExtendedWeek() {
        super(); // Call constructor of superclass
    }

    public void displayWeekend() {
        System.out.println("\nWeekend days:");
        for (Day day : days) {
            if (day == Day.SATURDAY || day == Day.SUNDAY) {
                System.out.println("- " + day);
            }
        }
    }
}