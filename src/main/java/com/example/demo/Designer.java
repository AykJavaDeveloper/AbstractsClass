package com.example.demo;

public class Designer extends Employee {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public Designer(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculateSalary(double salary) {
        this.salary = salary;
        return this.salary;
    }
}
