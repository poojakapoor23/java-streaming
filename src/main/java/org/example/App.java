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
        return strList.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static List<String> filterStringsStartingWithA(List<String> strList) {
        return strList.stream().filter(el -> el.startsWith("A")).collect(Collectors.toList());
    }

    public static List<Integer> uniqueIntegers(List<Integer> intsList) {
        return intsList.stream().distinct().collect(Collectors.toList());
    }

    public static int sumOfIntegers(List<Integer> intsList) {
        return intsList.stream().mapToInt(Integer::intValue).sum();
    }

    public static int minOfIntegers(List<Integer> intsList) {
        return intsList.stream().mapToInt(Integer::intValue).min().orElse(Integer.MIN_VALUE);
    }

    public static int maxOfIntegers(List<Integer> intsList) {
        return intsList.stream().mapToInt(Integer::intValue).max().orElse(Integer.MAX_VALUE);
    }

    public static String concatenateStringsWithComma(List<String> strList) {
        return strList.stream().collect(Collectors.joining(", "));
    }

    public static int getFirstIntegerOfList(List<Integer> intList) {
       return intList.stream().mapToInt(Integer::intValue).findFirst().orElse(0);}
    public static String getLastElementOfString(List<String> strList){
        if(strList == null || strList.isEmpty()) {
            return "";
        }
        else
       return strList.get(strList.size() - 1);

    }
    public static List<Integer> listOfSquares(List<Integer> intsList) {
        return intsList.stream().map(i -> i * i).collect(Collectors.toList());
    }
    public static List<Integer> filterEvenNumbers(List<Integer> intsList) {
        return intsList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }
    public static List<String> namesOfUsersOlderThan18(List<User> users) {
        return users.stream()
                .filter(u -> u.getAge() > 18)
                .map(User::getName)
                .collect(Collectors.toList());
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
        System.out.println("#8 concatenate String "+concatenateStringsWithComma(moreStrs));
        System.out.println("#9 Get first integer of List  " +getFirstIntegerOfList(intsList));
        System.out.println("#10 Get last element of String " +getLastElementOfString(strList));
        System.out.println("#11 List of squares: " + listOfSquares(intsList));

        System.out.println("#12 Even numbers: " + filterEvenNumbers(intsList));
        System.out.println("#13 Users > 18: " + namesOfUsersOlderThan18(users));

    }
    }



