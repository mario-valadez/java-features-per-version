package org.org.example;

import org.org.example.bean.Employee;

/**
 * What's new on Java 15?
 * -Sealed classes - Improve control over inheritance
 *
 * This class has examples for all new features
 */
public class Java15 {

    //In the following example Vehicle only permits Car Bike and Truck to inherit from it
    //all other classes are not permitted and will throw error
    public sealed class Vehicle permits Car, Bike, Truck { }

    final class Car extends Vehicle {}
    final class Bike extends Vehicle {}
    final class Truck extends Vehicle {}

    //We're getting an expected error 'Plane' is not allowed in the sealed hierarchy
    final class Plane extends Vehicle {}
}
