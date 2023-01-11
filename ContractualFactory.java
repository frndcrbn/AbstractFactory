package com.example.designpattern;

public class ContractualFactory implements IEmployeeFactory{
    @Override
    public IEmployee createEmployee(Role role){
        switch (role){
            case Janitor:
                return new ContractualJanitor();
            case Staff:
                return new ContractualStaff();
            case Manager:
                return new ContractualManager();
            default:
                return null;
        }
    }
}
