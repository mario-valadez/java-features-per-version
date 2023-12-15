package org.org.example;

import org.org.example.util.DummyData;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingDouble;

/**
 * What's new on Java 12?
 * -Improved switch Expressions
 * -Compact Format Numbers API
 * -Teeing Collectors
 * -New String Method Indent
 *
 * This class has examples for all new features
 */
public class Java12 {

    public String improvedSwitchExample(String dayOfTheWeek){
        //With the new Switch expression, we don’t need to set break everywhere thus prevent logic errors!
        return switch (dayOfTheWeek) {
            case "friday", "saturday", "sunday" -> "<3";
            case "monday", "thursday" -> ":(";
            default -> ":)";
        };
    }

    public void compactNumberFormatExample(){
        System.out.println("Compact Formatting is:");
        NumberFormat upvotes = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        upvotes.setMaximumFractionDigits(1);

        System.out.println(upvotes.format(2592) + " upvotes"); //2.5K upvotes
    }

    public void teeingCollectorsExample(){
        //Teeing Collector is the new collector utility introduced in the Streams API.
        // This collector has three arguments - Two collectors and a Bi-function. All input
        // values are passed to each collector and the result is available in the Bi-function.
        var result = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(
                        summingDouble(i -> i),
                        counting(),
                        (sum, n) -> sum / n));
        System.out.println(result);//Result is 3 = 1 + 2 + 3 + 4 + 5 = 15 / 5
    }

    public void indentStringExample(){
        System.out.println("public void".indent(4));//____public void
    }
}
