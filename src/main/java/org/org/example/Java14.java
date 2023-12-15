package org.org.example;

import org.org.example.bean.Employee;

/**
 * What's new on Java 14?
 * -instanceOf improvements
 * -Record classes (Just like data classes on Kotlin)
 *    * The Java compiler will generate a constructor, private final fields, accessors,
 *    equals/hashCode and toString methods automatically. The auto-generated getter methods of
 *    the above class are name() and topic()
 *
 * This class has examples for all new features
 */
public class Java14 {
    public void instanceOfImprovements(Object employeeObj){
        //Object can now be cast to the type using instanceOf in a single line
        if (employeeObj instanceof Employee employee) {
            System.out.println(employee.getLastName());
        }
    }

    //This will generate constructor with 3 fields, getter and setters name(), lastname(), age();
    //This is pretty neat, love Kotlin data classes
    record Worker (String name, String lastName, int age) {}

    //Example of a constructor with all data
    public Worker testWorkerInstance(){
        return new Worker("Mario", "Valadez", 36);
    }
}
