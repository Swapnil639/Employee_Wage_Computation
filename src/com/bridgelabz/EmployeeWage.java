package com.bridgelabz;

public class EmployeeWage {
    public static final int PART_TIME_WORK=1;
    public static final int FULL_TIME_WORK=2;
    public static final int RATE_PER_HOUR=20;

    public static void main(String[] args) {
        int employeeHrs=0;
        int employeeWage=0;
        double empCheck=Math.floor(Math.random()*10)%3;
        if(empCheck==FULL_TIME_WORK)
            employeeHrs=8;
        else if(empCheck==PART_TIME_WORK)
            employeeHrs=4;
        else
            employeeHrs=0;
        employeeWage=employeeHrs*RATE_PER_HOUR;
        System.out.println("Employee Wage :"+employeeWage);
    }
}