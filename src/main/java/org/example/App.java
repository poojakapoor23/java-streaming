package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

     //1. Find the number of elements in a list of strings.
    public static long findNumberOfElements(List<String> strList) {
        return strList.stream().count();
    }
    private static List<String> convertStringsToUppercase(List<String> strList) {
        return strList.stream().map(String::toUpperCase).collect(Collectors.toList());}
        public static List<String> filterStringsStartingWithA(List<String> strList) {
            return strList.stream().filter(el -> el.startsWith("A")).collect(Collectors.toList());}
            public static List<Integer>  uniqueIntegers(List<Integer> intsList) {
               return  intsList.stream().distinct().collect(Collectors.toList());}
            public static int  sumOfIntegers(List<Integer> intsList) {
             return  intsList.stream().mapToInt(Integer::intValue).sum();}
    public static int minOfIntegers(List<Integer> intsList) {
        return intsList.stream().mapToInt(Integer::intValue).min().orElse(Integer.MIN_VALUE);
    }
    public static int maxOfIntegers(List<Integer> intsList) {
        return intsList.stream().mapToInt(Integer::intValue).max().orElse(Integer.MAX_VALUE);
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
        System.out.println("#2 To uppercase: " + convertStringsToUppercase(strList));
        System.out.println("#3 Starts with A: " + filterStringsStartingWithA(moreStrs));
        System.out.println("#4  UniqueIntegers"  + uniqueIntegers(intsList));
        System.out.println("#4  Sum of Integers"  + sumOfIntegers(intsList));
        System.out.println("#6 Min int: " + minOfIntegers(intsList));
        System.out.println("#7 Max int: " + maxOfIntegers(intsList));

    }
    }



