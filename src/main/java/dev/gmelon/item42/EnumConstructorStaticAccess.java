package dev.gmelon.item42;

import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Stream;

public enum EnumConstructorStaticAccess {

    ONE("1"),
    TWO("2"),
    THREE("3");

    private final String value;

    EnumConstructorStaticAccess(String value) {
        this.value = value;

        Object[] array = Stream.of()
                .map(a -> this.value)
                .toArray();
    }
}
