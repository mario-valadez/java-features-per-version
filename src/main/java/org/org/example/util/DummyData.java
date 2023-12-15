package org.org.example.util;

import org.org.example.bean.Employee;

import java.util.ArrayList;
import java.util.List;

public class DummyData {
    public static List<Employee> employees = List.of(
        new Employee("Ira", "Archer", Employee.Department.SALES, 26),
        new Employee("Lilly", "Russo", Employee.Department.SALES, 23),
        new Employee("Earl","Jimenez", Employee.Department.SALES, 26),
        new Employee("Norman","Blackburn", Employee.Department.SALES, 22),
        new Employee("Ophelia","Barr", Employee.Department.SALES, 30),
        new Employee("Dwayne","Donovan", Employee.Department.SALES, 29),
        new Employee("Roberta","Werner", Employee.Department.SALES, 27),
        new Employee("Todd","Suarez", Employee.Department.SALES, 26),
        new Employee("Danilo","Mckee", Employee.Department.MANAGEMENT, 31),
        new Employee("Rae","Cunningham", Employee.Department.IT, 19),
        new Employee( "Alicia","Mueller", Employee.Department.IT, 22),
        new Employee("Young","Hess", Employee.Department.IT, 27),
        new Employee("Horacio","Cuevas", Employee.Department.IT, 25),
        new Employee("Ron","Flores", Employee.Department.IT, 22),
        new Employee("Chad","Brewer", Employee.Department.IT, 21),
        new Employee("Kelly", "Myers", Employee.Department.IT, 23),
        new Employee("Nita","Boyd", Employee.Department.IT, 25)
    );
}
