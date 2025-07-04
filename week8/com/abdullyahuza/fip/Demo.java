package com.abdullyahuza.fip;;

public class Demo {
    public static void main(String[] args) {
        // Create a Manager
        Manager manager = new Manager("Zainab", 101, "IT", 5);
        System.out.println("Manager: " + manager.getName() + " | Dept: " + manager.getDepartment());
        manager.assignTask();
        manager.conductMeeting();

        // Create a Software Engineer
        SoftwareEngineer engineer = new SoftwareEngineer("Aliyu", 202, "Java", 3);
        System.out.println("\nEngineer: " + engineer.getName() + " | Language: " + engineer.getProgrammingLanguage());
        engineer.developSoftware();
        engineer.writeTests();

        // Create an HR
        HR hr = new HR("Fatima", 303, "North-West", 50);
        System.out.println("\nHR: " + hr.getName() + " | Region: " + hr.getRegion());
        hr.hireEmployee();
        hr.enforcePolicy();

        // Create an Internal Project
        InternalProject project = new InternalProject("Payroll System", 1500000, 6, "Ongoing");
        System.out.println("\nProject: " + project.getProjectName() + " | Budget: ₦" + project.getBudget());
        project.startProject();

        // Create a Monthly Report
        MonthlyReport report = new MonthlyReport("June Report", "All operations running smoothly", "June", 12);
        System.out.println("\nReport: " + report.getTitle() + " | Pages: " + report.getPageCount());
        report.generate();
    }
}
