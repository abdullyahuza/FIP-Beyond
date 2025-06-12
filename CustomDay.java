class CustomDay implements DayHoursCalculator {
    private int totalHours;
    private int workingHours;

    public CustomDay(int totalHours, int workingHours) {
        this.totalHours = totalHours;
        this.workingHours = workingHours;
    }

    public int getTotalHoursInDay() {
        return totalHours;
    }

    public int getWorkingHoursInDay() {
        return workingHours;
    }
}