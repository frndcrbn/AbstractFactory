package com.example.designpattern;

public class EmployeeAbstractFactory {
    public static IEmployeeFactory getFactory(EmploymentStatus status){
        if(status == EmploymentStatus.Regular)
            return new EmployeeFactory();
        else
            return new ContractualFactory();
    }
}
