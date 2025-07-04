package com.abdullyahuza.fip;

public class MonthlyReport extends Report {
    private String month;
    private int pageCount;

    public MonthlyReport(String title, String content, String month, int pageCount) {
        super(title, content);
        this.month = month;
        this.pageCount = pageCount;
    }

    public String getMonth() { return month; }
    public void setMonth(String month) { this.month = month; }

    public int getPageCount() { return pageCount; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }

    @Override
    public void generate() {
        System.out.println("Generating monthly report for " + month);
    }
}
