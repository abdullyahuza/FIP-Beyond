package com.abdullyahuza.fip;

public class Manager extends Employee implements ManagerActions {
    private String department;
    private int teamSize;

    public Manager(String name, int id, String department, int teamSize) {
        super(name, id);
        this.department = department;
        this.teamSize = teamSize;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public int getTeamSize() { return teamSize; }
    public void setTeamSize(int teamSize) { this.teamSize = teamSize; }

    @Override
    public void assignTask() { System.out.println("Assigning task"); }
    @Override
    public void evaluatePerformance() { System.out.println("Evaluating performance"); }
    @Override
    public void conductMeeting() { System.out.println("Conducting meeting"); }

    @Override
    public void performDuties() { assignTask(); conductMeeting(); }
}
