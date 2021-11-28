package org.pasksoftware.monad;

import java.util.function.Function;

public interface Monad<T> {

    // Instance should be only created with of method
    // one have to care about this themselves in implementing classes
    // In perfect case `of` should be made static to ease creation of new instances
    // check ReferentialMonad or LogMonad for good examples
    Monad<T> of(T value);

    <U> Monad<U> flatMap(Function<T, Monad<U>> function);
}
