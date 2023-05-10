package com.example.demo;

public class JavaDeveloper extends Employee {

    private double salary;
    private double petProject;


    public JavaDeveloper(double salary) {
      this.salary = salary;
    }

    public double getPetProject() {
        return petProject;
    }

    public double getSalary() {
        return salary;
    }

    public void setPetProject(double petProject) {
        this.petProject = petProject;
        salary += petProject;
    }

    @Override
    public double calculateSalary(double salary) {
        this.salary = salary;
        return this.salary;
    }
}
