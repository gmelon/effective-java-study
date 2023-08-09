package dev.gmelon.item47;

import java.util.stream.Stream;

public class StreamReturnsIterator {

    public static void main(String[] args) {
        for (String arg : (Iterable<String>) Stream.of("a", "b", "c")::iterator) {
            System.out.println(arg);
        }

        Iterable<String> i = () -> Stream.of("a", "b", "c").iterator();
        for (String s : i) {
            System.out.println(s);
        }
//        Iterable<String> iterable = (Iterable<String>) supplier.get();

//        long collect = Stream.of("a", "b", "c")
//                .collect(Collectors.counting());
//        System.out.println(collect); // 3
//
//        long count = Stream.of("a", "b", "c")
//                .count();
//        System.out.println(count); // 3
//
//        Map<String, Long> map = Stream.of("a", "a", "b", "b", "c")
//                .collect(Collectors.groupingBy(a -> a, Collectors.counting()));
//        System.out.println(map); // {a=2, b=2, c=1}
    }

}
