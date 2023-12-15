package org.org.example;

import org.org.example.bean.Employee;

import java.util.List;

/**
 * What's new on Java 8?
 * -Functional programming features like:
 *  * Lambda expressions. A lambda expression is a short block of code which takes in parameters and returns a value.
 *    Lambda expressions are similar to methods, but they do not need a name, and they can be implemented right in the body of a method.
 *  * Stream API features. Includes features to improve lists usability like:
 *    - forEach = Iterates over a list, better used when the iteration should not return a result
 *    - filter = Filters elements on a list
 *    - find first = returns the first occurrence on a list that matches the predicate
 *    - orElse
 *
 * This class has examples for all new features
 */
public class Java8 {
    /**
     * Returns the employee full name
     */
    public List<String> getEmployeesFullName(List<Employee> listEmployees){
        return listEmployees.stream().map( e -> e.getFirstName() + " " + e.getLastName()).toList();
    }

    /**
     * Prints employee full name
     */
    public void printEmployeesFullName(List<Employee> listEmployees){
        listEmployees.stream().forEach( e -> System.out.println(e.getFirstName() + " " + e.getLastName()));
    }

    /**
     * Filters employees by lastname
     */
    public List<Employee> filterEmployeesByLastName(List<Employee> listEmployees, String lastName ){
        return listEmployees.stream().filter( e -> e.getLastName().equals(lastName)).toList();
    }

    /**
     * Filters employees by lastname
     */
    public Employee findFirstEmployeeOrNull(List<Employee> listEmployees){
        return listEmployees.stream().findFirst().orElse(null);
    }

}
