package com.example.designpattern;

public class ContractualJanitor implements IEmployee{
    @Override
    public void doWork(){
        System.out.println("Contractual Janitor - Clean Office");
    }
}
