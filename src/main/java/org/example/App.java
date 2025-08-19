package org.example;

import java.util.Arrays;
import java.util.List;

public class App {

    // 1. Find the number of elements in a list of strings.
    public static long findNumberOfElements(List<String> strList) {
        return strList.stream().count();
    }

    public static void main(String[] args) {
        System.out.println("== Java Stream API Methods Demo ==");

        List<String> strList =
                Arrays.asList("One", "Two", "Three", "Four", "Five", "And", "Again", "Javaaaa");
        List<Integer> intsList = Arrays.asList(1, 2, 3, 4, 5, 6, 4, 2);
        List<String> moreStrs = Arrays.asList("Apple", "Banana", "Axe", "cat");

        List<User> users =
                Arrays.asList(new User("Alice", 25), new User("Bob", 17), new User("Eve", 30));
        users.get(0).getHobbies().addAll(Arrays.asList("reading", "sports"));
        users.get(2).getHobbies().add("dancing");

        List<Person> persons =
                Arrays.asList(new Person("Tom", "City X"), new Person("Jane", "City Y"));

        System.out.println("#1 Elements count: " + findNumberOfElements(strList));

    }
}