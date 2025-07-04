package com.abdullyahuza.fip;

public class SoftwareEngineer extends Employee implements EngineerActions {
    private String programmingLanguage;
    private int experienceYears;

    public SoftwareEngineer(String name, int id, String programmingLanguage, int experienceYears) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
        this.experienceYears = experienceYears;
    }

    public String getProgrammingLanguage() { return programmingLanguage; }
    public void setProgrammingLanguage(String programmingLanguage) { this.programmingLanguage = programmingLanguage; }

    public int getExperienceYears() { return experienceYears; }
    public void setExperienceYears(int experienceYears) { this.experienceYears = experienceYears; }

    @Override
    public void developSoftware() { System.out.println("Developing software"); }
    @Override
    public void fixBugs() { System.out.println("Fixing bugs"); }
    @Override
    public void writeTests() { System.out.println("Writing tests"); }

    @Override
    public void performDuties() { developSoftware(); writeTests(); }
}
