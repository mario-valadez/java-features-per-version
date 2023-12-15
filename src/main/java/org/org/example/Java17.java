package org.org.example;

import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;

/**
 * What's new on Java 17?
 * - Enhanced Pseudo-Random Number Generators
 * - Pattern Matching for Switch (Preview)
 * -
 */
public class Java17 {

    //Pseudo random number generators now have it easier to change algorithm
    private IntStream enhancedPseudoRandomNumbers(String algorithm, int streamSize){
        return RandomGeneratorFactory.of(algorithm)
                .create()
                .ints(streamSize, 0,100);
    }


    //This is neat, can help reduce boilerplate code, since this is a preview it is not fully supported
    abstract class ColorfulShapes {
        int numberOfSides;
        String color;
        ColorfulShapes(int numberOfSide, String color){
            this.numberOfSides = numberOfSides;
            this.color = color;
        }
    }
    class Triangle extends ColorfulShapes {
        Triangle(String color) {
            super(3, color);
        }
    }

    class Rectangle extends ColorfulShapes{
        Rectangle(String color) {
            super(4, color);
        }
    }
    private String checkShape(ColorfulShapes shape) {
        return switch (shape) {
            case Triangle t -> "The triangle has %s sides, and is: %s color".formatted(t.numberOfSides, t.color);
            case Rectangle t -> "The triangle has %s sides, and is: %s color".formatted(t.numberOfSides, t.color);
                default -> "Just a normal shape";
        };
    }
}
