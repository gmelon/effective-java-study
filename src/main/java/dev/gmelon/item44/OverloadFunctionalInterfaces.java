package dev.gmelon.item44;

import java.util.concurrent.Callable;

public class OverloadFunctionalInterfaces {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.someMethod(() -> {}); // Runnable
        myClass.someMethod(() -> 1); // Callable
    }

    static class MyClass {
        public void someMethod(Runnable runnable) {

        }

        public <T> void someMethod(Callable<T> callable) {

        }
    }
}
