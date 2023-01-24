package com.ironhack.lab2.classes;

import com.ironhack.lab2.classes.Employee;

public class Intern extends Employee {
    private final int MAX_SALARY = 20000;

    public void setSalary(int salary) {
        if(salary > MAX_SALARY ){
            salary = MAX_SALARY;
        } else{
            salary=salary;
        }
        super.setSalary(salary);
    }

    public int getMAX_SALARY() {
        return MAX_SALARY;
    }

    public Intern(String name, int age, int salary) {
        super(name, age, salary);
    }

}