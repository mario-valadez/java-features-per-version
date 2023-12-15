package org.org.example;

import jdk.incubator.vector.IntVector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * What's new on Java 16?
 * - Stream.toList Method (Reduces boilerplate code)
 * - Vector API (Apply math operations with vectors)
 * - Records are now allowed as members in inner Classes
 * - Pattern matching for instanceof
 * This class has examples for all new features
 */
public class Java16 {

    //Stream to List example
    private void streamToListExample (){
        List<String> integersAsString = Arrays.asList("1", "2", "3");

        //Old way to do it
        List<Integer> ints = integersAsString.stream().map(Integer::parseInt).collect(Collectors.toList());

        //New way to do it using Stream.ToList();
        List<Integer> intsEquivalent = integersAsString.stream().map(Integer::parseInt).toList();
    }

    //Records API example
    private IntVector vectorApiExample(){
        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6 , 7, 8};
        var c = new int[a.length];

        var vectorA = IntVector.fromArray(IntVector.SPECIES_128, a, 0);
        var vectorB = IntVector.fromArray(IntVector.SPECIES_128, b, 0);

        //Returns the multiplication of vectorA and vectorB
        return vectorA.mul(vectorB);
    }


    //Record class can now be used as members in inner classes
    private record Book(String title, String author, String isbn)

    class OuterClass {
        class InnerClass {
            Book book = new Book("Title", "author", "isbn");
        }
    }

    //Pattern matching for instance of
    private void matchingInstanceOfExample(){
        Object obj = "Example";

        //Old way of using instance of
        if (obj instanceof String) {
            String t = (String) obj;
        }

        //New way can create the variable in a single line
        if (obj instanceof String t) {
            // do some logic
        }
    }
}
