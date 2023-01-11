package com.example.designpattern;

public class EmployeeFactory implements IEmployeeFactory{
    public IEmployee createEmployee(Role role) {
        switch (role){
            case Janitor:
                return new Janitor();
            case Staff:
                return new Staff();
            case Manager:
                return new Manager();
            default:
                return null;
        }
    }
}
