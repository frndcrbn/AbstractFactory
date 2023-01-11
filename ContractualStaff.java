package com.example.designpattern;

public class ContractualStaff implements IEmployee{
    @Override
    public void doWork(){
        System.out.println("Contractual Staff - Do paper Works");
    }
}
