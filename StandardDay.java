// Implement the interface
class StandardDay implements DayHoursCalculator {
    // Full day has 24 hours
    public int getTotalHoursInDay() {
        return 24;
    }

    // Standard working day has 8 hours
    public int getWorkingHoursInDay() {
        return 8;
    }
}