package com.bridgelabz;

public class EmployeeWage {
    public static final int PART_TIME_WORK = 1;
    public static final int FULL_TIME_WORK = 2;
    public static final int RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAXIMUM_HRS_IN_MONTH = 100;


    public static void main(String[] args) {
        int employeeHrs = 0;
        int totalempHrs=0;
        int totalWorkingDays=0;
        int totalemployeeWage=0;
        int  empilyeeWage=0;

        while(totalempHrs <= MAXIMUM_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
            totalWorkingDays++;
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

            totalempHrs +=employeeHrs;
            empilyeeWage = employeeHrs * RATE_PER_HOUR;
            totalemployeeWage += empilyeeWage;
            System.out.println("Day: " +totalWorkingDays+ " Employee Hour :" + employeeHrs);
        }
        System.out.println("Total Emp Wage :"+totalemployeeWage);
    }

}