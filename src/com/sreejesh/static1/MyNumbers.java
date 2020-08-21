package com.sreejesh.static1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class MyNumbers {
//    method candidate for lambda
    public static boolean isSumMoreThanFifty(int n1, int n2) {
        return (n1 + n2) > 50;
    }
// The method that uses functional interface reference as one of its parameters
    public static List<Integer> findNumbers(List<Integer> integerList, BiPredicate<Integer, Integer> biPredicate) {
        List<Integer> filteredIntegerList = new ArrayList<>();
        for (Integer i : integerList) {
            if (biPredicate.test(i, i + 10)) {
                filteredIntegerList.add(i);
            }
        }
        return filteredIntegerList;
    }

}
