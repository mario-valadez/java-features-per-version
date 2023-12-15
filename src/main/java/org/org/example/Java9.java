package org.org.example;

import org.org.example.bean.Employee;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * What's new on Java 9?
 * -Factory Methods for Immutable List, Set, Map and Map.Entry
 *  * List.Of, Set.Of, Map.Of
 * -Private methods in Interfaces
 * -Improvements on Optional, and Process Apis
 *
 * This class has examples for all new features (Not much in this one)
 */
public class Java9{
    private List<Integer> listExample = List.of(1, 2, 3);
    private Set<Integer> setExample = Set.of(1, 2, 3);
    private Map<Integer, String> mapExample = Map.of(1, "1", 2, "2", 3, "3");
}
