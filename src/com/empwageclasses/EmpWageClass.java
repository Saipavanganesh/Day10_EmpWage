package com.empwageclasses;

public class EmpWageClass {
    static int wagePerHour=20;
    static int fullDayHours=0;
    static int totalWorkingDays=20;
    static int maxHours=100;
    static int totalHoursWorked=0;
    static int daysPresent=0;
    static int salary;
    public String empWage(String companyName,int wagePerHour,int totalWorkingDays, int totalHoursWorked){

        System.out.println(companyName);
        while(daysPresent<totalWorkingDays && totalHoursWorked<maxHours){
            double empCheck=Math.floor(Math.random()*10)%3;
            switch (Double.toString(empCheck)){
                case "1.0":
                    //System.out.println("Employee is present");
                    daysPresent++;
                    fullDayHours=8;
                    totalHoursWorked = totalHoursWorked+fullDayHours;
                    break;
                case "2.0":
                    //System.out.println("Emp is Part time present");
                    fullDayHours=4;
                    totalHoursWorked = totalHoursWorked+fullDayHours;
                    daysPresent++;
                    break;
                default:
                    //System.out.println("Employee is absent");
                    fullDayHours=0;
                    totalHoursWorked = totalHoursWorked+fullDayHours;
                    break;
            }
        }

        salary=totalHoursWorked*wagePerHour;
        String display = "\nCompany : " + companyName + "\nTotal days : " +daysPresent + "\nTotal Hours = "+totalHoursWorked +"\nTotal Salary is "+salary;
        return display;
    }
}
