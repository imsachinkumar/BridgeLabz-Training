import java.util.*;

public class NameUppercase {
    public static void main(String[] args) {
        // Employee names
        List<String> names = Arrays.asList("rahul", "neha", "amit");
        // Convert to uppercase and print
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
