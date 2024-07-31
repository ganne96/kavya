package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("In another thread"));
        thread.start();
        System.out.println("In main thread");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        //external iterator
        for (Integer number : numbers) {
            System.out.println(number);

            //calling method on my list
            numbers.forEach(num -> System.out.println(number));
            // or numbers.forEach(System.out::println);

            List<String> numberStrings = numbers.stream()
                    .filter(num -> number > 5)
                    .map(String::valueOf)
                    .collect(Collectors.toList());
            numberStrings.forEach(System.out::println);
        }
    }
}
