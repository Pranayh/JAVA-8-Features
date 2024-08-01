package ForeachLoop;

import java.util.function.BiFunction;
import java.util.function.Function;

// Bifunction : is used to send two parameters at a time
// function interface : only one input parameter at a time



// Traditional Way:

//public class BiFunctionDemo implements BiFunction<Integer,Integer, Integer> {
//
//    @Override
//    public Integer apply(Integer i, Integer j) {
//        return (i+j);
//    }
//
//    public static void main(String[] args) {
//
//        BiFunction<Integer,Integer,Integer> biFunction = new BiFunctionDemo();
//        System.out.println(biFunction.apply(20,30));
//
//    }
//
//}


//After Java 8: Using Lambda

public class BiFunctionDemo{

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> add = (i,j)->(i+j);
        BiFunction<Integer,Integer,Integer> sub = (i,j)->(i-j);
        BiFunction<Integer,Integer,Integer> mul = (i,j)->(i*j);

        System.out.println("Addition: "+add.apply(10,20));
        System.out.println("Sub: "+sub.apply(30,50));
        System.out.println("MultiPlication: "+mul.apply(5,6));


        // Here, Integer : Input, 2nd Integer : result
        Function<Integer,Integer> addSumProduct= (sum)->(sum*sum);

        System.out.println(add.andThen(addSumProduct).apply(2,3));


    }
}
