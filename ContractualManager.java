package com.example.designpattern;

public class ContractualManager implements IEmployee{
    @Override
    public void doWork(){
        System.out.println("Contractual Manager - Manage Employees");
    }
}
