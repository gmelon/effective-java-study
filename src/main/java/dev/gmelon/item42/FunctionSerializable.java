package dev.gmelon.item42;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionSerializable {
    public static void main(String[] args) throws IOException {

        MySerializableClass mySerializableClass = new MySerializableClass();

        byte[] serializedMember;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(mySerializableClass);
                serializedMember = baos.toByteArray();
            }
        }

        System.out.println(Arrays.toString(serializedMember));
    }

    static class MySerializableClass implements Serializable, Function<Integer, Integer> {

        @Override
        public Integer apply(Integer integer) {
            return integer;
        }
    }

}

@FunctionalInterface
interface MyFunction extends Function<Integer, Integer>, Serializable {
    @Override
    Integer apply(Integer integer);
}
