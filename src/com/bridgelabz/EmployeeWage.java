package com.bridgelabz;

public class EmployeeWage {
    public static final int PART_TIME_WORK = 1;
    public static final int FULL_TIME_WORK = 2;
    public static final int RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAXIMUM_HRS_IN_MONTH = 100;

    public static void computeEmployeeWage() {
        int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= MAXIMUM_HRS_IN_MONTH && totalWorkingDays <= NUM_OF_WORKING_DAYS) {

            int empHrs = 0;
            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {

                case FULL_TIME_WORK:
                    empHrs = 8;
                    break;

                case PART_TIME_WORK:
                    empHrs = 4;
                    break;

                default:
                    empHrs = 0;
            }

            totalEmpHrs += empHrs;
            System.out.println("Working hours : " + empHrs);
            int empWage = empHrs * RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Employee Wage : " + empWage);
        }
        System.out.println("Total working hours : " + totalEmpHrs);
        System.out.println("Total employee wage : " + totalEmpWage);
    }
    public static void main(String[] args) {
        computeEmployeeWage();
    }
}