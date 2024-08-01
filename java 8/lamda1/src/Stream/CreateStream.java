package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Notes to read: https://medium.com/thefreshwrites/java-8-stream-api-interview-questions-and-answers-dd559ebffb35

//Stream:
// It is a sequence of elements from a source (like a collection, array, or I/O channel)
//that supports aggregate operations(methods that process elements from a stream
// and produce a single result. They are also known as stream operations).

//Stream API, introduced in Java 8, is a powerful tool for processing collections of
//objects in a functional style. It allows you to perform operations like filtering,
//mapping, and reducing on data in a declarative way



public class CreateStream {

    public static void main(String[] args) {

        // create a stream
        Stream<String> stream1= Stream.of("a","b","c");
        stream1.forEach(System.out::println);


        // create stream from other sources:

        List<String> str1 = Arrays.asList("mango","banana","apple");
        Stream<String>stream2 = str1.stream();
        stream2.forEach(System.out::println);

        String[] arr1 = {"x","y","z"};
        Stream<String> stream3 = Arrays.stream(arr1);
        stream3.forEach(System.out::println);

    }
}
