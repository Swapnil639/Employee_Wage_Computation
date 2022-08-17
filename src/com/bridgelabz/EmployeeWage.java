package com.bridgelabz;

public class EmployeeWage {
    public static final int PART_TIME_WORK = 1;
    public static final int FULL_TIME_WORK = 2;
    public static final int RATE_PER_HOUR = 20;

    public static void main(String[] args) {
        int employeeHrs = 0;
        int employeeWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case FULL_TIME_WORK:
                employeeHrs = 8;
                break;
            case PART_TIME_WORK:
                employeeHrs = 4;
                break;
            default:
                employeeHrs = 0;
                break;
        }
        employeeWage = employeeHrs * RATE_PER_HOUR;
        System.out.println("Employee Wage :" + employeeWage);

    }

}