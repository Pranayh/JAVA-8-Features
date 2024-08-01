package SomefunctionalInterface;

import java.util.function.Function;


// Traditional way :
//class FunctionImpl implements Function<String,Integer>{
//
//    @Override
//    public Integer apply(String s) {
//       return s.length();
//    }
//}


public class functionDemo {

    public static void main(String[] args) {
//        Function<String,Integer> function = new FunctionImpl();
//        System.out.println(function.apply("Pranay"));


        // Using Lambda Function:
        Function<String,Integer> function1= (s)-> s.length();
        System.out.println(function1.apply("Haramwar"));
    }


}
