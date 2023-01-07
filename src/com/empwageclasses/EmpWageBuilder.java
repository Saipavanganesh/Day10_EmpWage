package com.empwageclasses;

import java.util.ArrayList;

public class EmpWageBuilder {
    public static void main(String[] args) {
        ArrayList<String> companyWage = new ArrayList<String>();
        EmpWageClass empWageClass = new EmpWageClass();
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println("********************************************");
        System.out.println();
        companyWage.add(empWageClass.empWage("Ultimo",100,31,9));
        companyWage.add(empWageClass.empWage("Infosys",50,30,8));
        companyWage.add(empWageClass.empWage("TCS",31,49,8));

        for(int i=0; i<companyWage.size(); i++){
            System.out.println("\n"+companyWage.get(i));
        }
    }
}
