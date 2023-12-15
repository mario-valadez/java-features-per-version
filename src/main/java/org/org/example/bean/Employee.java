package org.org.example.bean;

import java.util.Objects;

public class Employee {
    public Employee(String firstName, String lastName, Department department, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.age = age;
    }

    private String firstName;
    private String lastName;
    private Department department;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public enum Department {
        SALES, IT, MANAGEMENT
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && department == employee.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, department, age);
    }
}


