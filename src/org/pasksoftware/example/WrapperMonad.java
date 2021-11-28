package org.pasksoftware.example;

import java.util.function.Function;

public final class WrapperMonad<T> {

    private final T value;

    private WrapperMonad(T value) {
        this.value = value;
    }

    static <T> WrapperMonad<T> of(T value) {
        return new WrapperMonad<>(value);
    }

    <U> WrapperMonad<U> flatMap(Function<T, WrapperMonad<U>> function) {
        return function.apply(value);
    }

    boolean valueEquals(T x) {
        return value.equals(x);
    }
}