package org.example;

import org.junit.jupiter.api.Test;
import org.org.example.Java10;
import org.org.example.bean.Employee;
import org.org.example.util.DummyData;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Java10Test {

    private Java10 java10 = new Java10();

    @Test
    public void testCopyListElements(){
        List<Employee> expected = List.of(
            new Employee("Ira", "Archer", Employee.Department.SALES, 26),
            new Employee("Lilly", "Russo", Employee.Department.SALES, 23)
        );

        List<Employee> actual = java10.copyListElements(DummyData.employees, 0, 2);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetFirstOrErrorPositive(){
        Employee expected = new Employee("Ira", "Archer", Employee.Department.SALES, 26);

        Employee actual = java10.getFirstOrError(DummyData.employees);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetFirstOrErrorNegative(){
        assertThrows(IllegalStateException.class, () -> {
            java10.getFirstOrError(List.of());
        });
    }
}
