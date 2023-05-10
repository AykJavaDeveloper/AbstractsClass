package com.example.demo;

public class Main {
    public static void main(String[] args) {
        JavaDeveloper developer = new JavaDeveloper(100_000);
        developer.setPetProject(300_000);

        Designer designer = new Designer(90_000);
        System.out.println("Salary Java Developer: ".concat(String.valueOf(developer.getSalary()))
                .concat("\nSalary Designer: ").concat(String.valueOf(designer.getSalary()))
        );
    }
}

