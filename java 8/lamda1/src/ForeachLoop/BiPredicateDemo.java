package ForeachLoop;

//Predicate Interface Accepts one input and return Boolean value.
// BiPredicate Interface Accepts two inputs and return Boolean value.

import java.util.function.BiPredicate;

// Traditional Implementaion
//public class BiPredicateDemo implements BiPredicate<Integer,Integer> {
//    public static void main(String[] args) {
//
//        BiPredicate<Integer,Integer> biPredicate = new BiPredicateDemo();
//        System.out.println(biPredicate.test(5,4));
//    }
//
//    @Override
//    public boolean test(Integer a, Integer b) {
//        return a>b;
//    }
//}


// After Java 8:  Using Lambda Expression

public class BiPredicateDemo{
    public static void main(String[] args) {

        BiPredicate<Integer,Integer> biPredicate = (a,b)->(a>b);
        BiPredicate<Integer,Integer> biPredicate2 = (a,b)->(a.equals(b));
        System.out.println(biPredicate.test(5,4));                    // Test
        System.out.println(biPredicate2.test(5,4));

        System.out.println(biPredicate.and(biPredicate2).test(11,10));    // And
        // here, biPredicate is True and biPredicate2 is false, therefor true AND false give False.

        System.out.println(biPredicate.or(biPredicate2).test(11,10));    // or
        // here, biPredicate is True and biPredicate2 is false, therefor true or false give True.


    }
}