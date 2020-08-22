package com.sreejesh.static_test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;



public class Main {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(12,5,45,18,33,24,40);

        BiPredicate<Integer, Integer> biPredicate = (i1, i2) -> MyNumbers.isSumMoreThanFifty(i1, i2);
        biPredicate.test(1,2);

// Using an anonymous class
        List<Integer> numberListUsingAnonymousClass = MyNumbers.findNumbers(listOfIntegers, new BiPredicate<Integer, Integer>() {
            public boolean test(Integer i1, Integer i2) {
                return MyNumbers.isSumMoreThanFifty(i1, i2);
            }
        });

// Using a lambda expression
        List<Integer> numberListUsingLambda = MyNumbers.findNumbers(listOfIntegers, (i1, i2) -> MyNumbers.isSumMoreThanFifty(i1, i2));

// Using a method reference
        List<Integer> numberListUsingMethodReference = MyNumbers.findNumbers(listOfIntegers, MyNumbers::isSumMoreThanFifty);

        System.out.println("numberListUsingAnonymousClass: "+numberListUsingAnonymousClass);
        System.out.println("numberListUsingLambda: "+numberListUsingLambda);
        System.out.println("numberListUsingMethodReference: "+numberListUsingMethodReference);

    }
}
