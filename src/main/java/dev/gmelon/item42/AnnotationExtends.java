package dev.gmelon.item42;

import java.lang.annotation.*;

public class AnnotationExtends {

    @Student
    static class AClass {

    }

    static class BClass extends AClass {

    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("dev.gmelon.item42.AnnotationExtends$AClass");
        Annotation[] annotationsA = aClass.getAnnotations();
        for (Annotation annotation : annotationsA) {
            System.out.println("a - " + annotation);
        }

        Class<?> bClass = Class.forName("dev.gmelon.item42.AnnotationExtends$BClass");
        Annotation[] annotationsB = bClass.getAnnotations();
        for (Annotation annotation : annotationsB) {
            System.out.println("b - " + annotation);
        }
    }

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Student {
}
