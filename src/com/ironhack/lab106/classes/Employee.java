package com.ironhack.lab2.classes;

public class Employee {
    public String name;
    public int age;
    protected double salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }
}
