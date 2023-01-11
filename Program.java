package com.example.designpattern;

public class Program {
    public static void main(String[] args) {
        var factory = EmployeeAbstractFactory.getFactory(EmploymentStatus.Contractual);
        var employee = factory.createEmployee(Role.Manager);
        employee.doWork();
    }
}
