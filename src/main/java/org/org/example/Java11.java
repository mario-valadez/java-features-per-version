package org.org.example;

import org.org.example.bean.Employee;
import org.org.example.util.DummyData;

import java.util.List;
import java.util.stream.Collectors;

/**
 * What's new on Java 11?
 * -New utility methods in String class
 *   *isBlank() - This instance method returns a boolean value. Empty Strings and Strings with only white spaces are treated as blank.
 *   *lines() This method returns a stream of strings, which is a collection of all substrings split by lines.
 *   strip(), stripLeading(), stripTrailing() strip() - Removes the white space from both, beginning and the end of string.
 *   repeat(int) The repeat method simply repeats the string that many numbers of times as mentioned in the method in the form of an int.
 * -Local-Variable Syntax for Lambda Parameters
 * Also Oracle Java is no longer free
 *
 * This class has examples for all new features
 */
public class Java11 {

    public void isBlankExamples(){
        System.out.println(" ".isBlank()); //true
        String s = "Mario";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true
    }

    public void linesExample(){
        String str = "JD\nJD\nJD";
        System.out.println(str.lines().collect(Collectors.toList()));
        //prints [JD, JD, JD]
    }

    public void stripExamples(){
        String str = " String ";
        System.out.print(str.strip()); //String

        System.out.print(str.stripLeading());//String_

        System.out.print(str.stripTrailing());//_String
    }

    public void repeatExample(){
        String str = "=";
        System.out.print(str.repeat(4)); //=====
    }

    public void lambdaLocalVariableExample(){
        DummyData.employees.stream().filter( (var employee) -> employee.getLastName().equals("Mario"));
    }
}
