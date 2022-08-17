package com.bridgelabz;

public class EmployeeWage {
    public static final int FULL_TIME_WORK = 1;

    public static void main(String[] args) {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == FULL_TIME_WORK)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}