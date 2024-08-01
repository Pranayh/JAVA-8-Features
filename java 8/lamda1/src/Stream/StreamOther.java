package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
// here, We are going to perform operations like count(),min(), max() etc.
public class StreamOther {
    public static void main(String[] args) {
        Stream<Integer> streamList1 = Stream.of(1,3,4,5,67);
        //streamList1.forEach(System.out::println);

        // count () : Count number of element in the stream
        System.out.println(streamList1.count());


        // min()
        Integer minValue= Stream.of(1,3,4,5,67).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min value in Array: "+ minValue);

        // max()
        Integer maxValue= Stream.of(1,3,4,5,67).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Max value in Array: "+ maxValue);
    }
}
