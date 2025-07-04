package com.abdullyahuza.fip;

public class InternalProject extends Project implements ProjectActions {
    private int durationInMonths;
    private String status;

    public InternalProject(String name, double budget, int duration, String status) {
        super(name, budget);
        this.durationInMonths = duration;
        this.status = status;
    }

    public int getDurationInMonths() { return durationInMonths; }
    public void setDurationInMonths(int durationInMonths) { this.durationInMonths = durationInMonths; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public void startProject() { System.out.println("Starting internal project"); }
    @Override
    public void pauseProject() { System.out.println("Pausing internal project"); }
    @Override
    public void completeProject() { System.out.println("Completing internal project"); }

    @Override
    public void execute() { startProject(); }
}
