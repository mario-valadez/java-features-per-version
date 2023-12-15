package org.org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingDouble;

/**
 * What's new on Java 13?
 * -Text blocks
 * -Switch expression improvements
 * This class has examples for all new features
 */
public class Java13 {
    public void textBlockError(){
        //This will be so useful when creating JSON or HTML text
        String textBlock = """
            Hi
            Hello
            Yes""";

        String str = "Hi\nHello\nYes";

        System.out.println(textBlock.equals(str)); //true
        System.out.println(textBlock == str); //true
    }

    public int switchImprovementExample(int choice){
        // switch expressions, use yield to return, in Java 12 it was break
        return switch (choice) {
            case 1, 2, 3:
                yield choice;
            default:
                yield -1;
        };
    }

}
