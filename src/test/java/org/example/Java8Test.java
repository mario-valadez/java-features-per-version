package org.example;

import org.junit.jupiter.api.Test;
import org.org.example.Java8;
import org.org.example.bean.Employee;
import org.org.example.util.DummyData;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Java8Test {

    private Java8 java8 = new Java8();

    @Test
    public void testGetEmployeesFullName(){
        List<String> expected = List.of(
            "Ira Archer",
            "Lilly Russo",
            "Earl Jimenez",
            "Norman Blackburn",
            "Ophelia Barr",
            "Dwayne Donovan",
            "Roberta Werner",
            "Todd Suarez",
            "Danilo Mckee",
            "Rae Cunningham",
            "Alicia Mueller",
            "Young Hess",
            "Horacio Cuevas",
            "Ron Flores",
            "Chad Brewer",
            "Kelly Myers",
            "Nita Boyd"
        );

        List<String> actual = java8.getEmployeesFullName(DummyData.employees);

        assertEquals(expected, actual);
    }

    @Test
    public void testFilterEmployeesByLastName(){
        List<Employee> expected = List.of(
            new Employee( "Alicia","Mueller", Employee.Department.IT, 22)
        );

        List<Employee> actual = java8.filterEmployeesByLastName(DummyData.employees, "Mueller");

        assertEquals(expected, actual);
    }

    @Test
    public void testFindFirst(){
        Employee expected = new Employee("Ira", "Archer", Employee.Department.SALES, 26);

        Employee actual = java8.findFirstEmployeeOrNull(DummyData.employees);

        assertEquals(expected, actual);
    }
}
