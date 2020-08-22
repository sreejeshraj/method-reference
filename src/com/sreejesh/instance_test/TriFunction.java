package com.sreejesh.instance_test;

/**
 * Example of TriFunction
 *
 * @author Andre Dias
 * @since 2017-08-12
 */
@FunctionalInterface
public interface TriFunction<F, S, T, R> {

    public R apply(F first, S second, T third);

}
