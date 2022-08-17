package com.bridgelabz;

public class EmployeeWage {
    public static final int PART_TIME_WORK = 1;
    public static final int FULL_TIME_WORK = 2;
    public static final int RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;


    public static void main(String[] args) {
        int employeeHrs = 0;
        int employeeWage = 0;
        int totalemployeeWage = 0;
        for (int day = 1; day <=NUM_OF_WORKING_DAYS; day++) {
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
            }

            employeeWage = employeeHrs * RATE_PER_HOUR;
            totalemployeeWage += employeeWage;
            System.out.println("Employee Wage :" + employeeWage);
        }

        System.out.println("Total Emp Wage :"+totalemployeeWage);
    }

}