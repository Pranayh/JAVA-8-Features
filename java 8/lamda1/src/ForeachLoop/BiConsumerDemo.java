package ForeachLoop;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

// Consumer Interface only accept one parameter and return nothing
// BiConsumer will take two parameter as input and return nothing

// Traditional way:

//public class BiConsumerDemo implements BiConsumer<Integer,Integer> {
//
//    public static void main(String[] args) {
//
//        BiConsumer<Integer,Integer> biConsumer = new BiConsumerDemo();
//        biConsumer.accept(10,20);
//
//
//    }
//
//    @Override
//    public void accept(Integer a, Integer b) {
//        System.out.println(a+b);
//    }
//}

public class BiConsumerDemo{
    public static void main(String[] args) {

        // After Java 8: Using Lambda Expression
        BiConsumer<Integer,Integer> biConsumer= (a,b) -> {
            System.out.println(a+b);
        };
        biConsumer.accept(2,3);



        //map.forEach take input as consumer interface

        Map<Integer,String > mapConsume= new LinkedHashMap<>();

        mapConsume.put(1,"Java");
        mapConsume.put(2,"C++");
        mapConsume.put(3,"C");
        mapConsume.put(4,"Python");
        mapConsume.put(5,"Go");

        mapConsume.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });


    }
}

