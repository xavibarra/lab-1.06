package com.ironhack.lab106.main;

import com.ironhack.lab2.classes.Employee;
import com.ironhack.lab2.classes.Intern;

import java.io.IOException;
import java.io.FileWriter;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {

        Employee employee1 = new Employee("Liam", 19, 20000);
        Employee employee2 = new Employee("Noah", 23, 25000);
        Employee employee3 = new Employee("Oliver", 34, 30000);
        Employee employee4 = new Employee("Amelia", 45, 30000);
        Employee employee5 = new Employee("Elijah", 20, 25000);
        Employee employee6 = new Employee("Charlotte", 28, 20000);
        Employee employee7 = new Employee("Emma", 23, 35000);
        Intern employee8 = new Intern("Olivia", 23, 20000);
        Intern employee9 = new Intern("John", 39, 25000);
        Intern employee10 = new Intern("Alex", 42, 30000);

        String[] employees = {String.valueOf(employee1)+ "\n", String.valueOf(employee2)+ "\n",
                String.valueOf(employee3)+ "\n", String.valueOf(employee4)+ "\n", String.valueOf(employee5)+ "\n",
                String.valueOf(employee6)+ "\n", String.valueOf(employee7+ "\n"), String.valueOf(employee8)+ "\n",
                String.valueOf(employee9)+ "\n", String.valueOf(employee10)};

        FileWriter writer = new FileWriter("result.txt", false);

        writer.write(Arrays.toString(employees));
        writer.close();
    }
}
