package org.org.example;

import org.org.example.bean.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * What's new on Java 10?
 * -List, Map & Set Interfaces are added with a static copyOf(Collection) method. Its returns an unmodifiable List, Map or Set containing the entries provided. For a List, if the given List is subsequently modified, the returned List will not reflect such modifications.
 * -Optional & its primitive variations get a method orElseThrow(). This is exactly same as get(), however the java doc states that it is a preferred alternative then get()*
 * -Smart local variable type
 *
 * This class has examples for all new features
 */
public class Java10 {

    public List<Employee> copyListElements(List<Employee> listEmployee, int startIndex, int endIndex){
        return List.copyOf(listEmployee.subList(startIndex, endIndex));
    }

    public Employee getFirstOrError(List<Employee> listEmployee){
        return listEmployee.stream().findFirst().orElseThrow(
                () -> new IllegalStateException("Element not found exception")
        );
    }

    private void localSmartVariableExample(){
        var example = "This will be resolved to String type";
        var example2 = 0;
        var example3 = List.of("This will be resolved to List of Strings");
    }
}
