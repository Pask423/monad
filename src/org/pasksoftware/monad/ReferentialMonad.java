package org.pasksoftware.monad;

import java.util.function.Function;

public final class ReferentialMonad<T> {

    private final T value;

    private ReferentialMonad(T value) {
        this.value = value;
    }

    static <T> ReferentialMonad<T> of(T value) {
        return new ReferentialMonad<>(value);
    }

    <U> ReferentialMonad<U> flatMap(Function<T, ReferentialMonad<U>> function) {
        return function.apply(value);
    }
}
