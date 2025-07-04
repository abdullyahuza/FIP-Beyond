package com.abdullyahuza.fip;

public class HR extends Employee implements HRPolicy {
    private String region;
    private int handledEmployees;

    public HR(String name, int id, String region, int handledEmployees) {
        super(name, id);
        this.region = region;
        this.handledEmployees = handledEmployees;
    }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public int getHandledEmployees() { return handledEmployees; }
    public void setHandledEmployees(int handledEmployees) { this.handledEmployees = handledEmployees; }

    @Override
    public void enforcePolicy() { System.out.println("Enforcing HR policy"); }
    @Override
    public void hireEmployee() { System.out.println("Hiring employee"); }
    @Override
    public void conductTraining() { System.out.println("Conducting training"); }

    @Override
    public void performDuties() { enforcePolicy(); hireEmployee(); }
}
