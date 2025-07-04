package com.abdullyahuza.fip;

public abstract class Project {
    private String projectName;
    private double budget;

    public Project(String projectName, double budget) {
        this.projectName = projectName;
        this.budget = budget;
    }

    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) { this.projectName = projectName; }

    public double getBudget() { return budget; }
    public void setBudget(double budget) { this.budget = budget; }

    public abstract void execute();
}
