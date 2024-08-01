package MethodRef;


import java.util.function.BiFunction;

public class methodRefToStatiMethod {

    // Static Method:
    public static int additon(int a, int b)
    {
        return (a+b);
    }


    public static void main(String[] args) {

        // By using lambda method:
        BiFunction<Integer,Integer,Integer> function= (a,b) -> methodRefToStatiMethod.additon(a,b);
        System.out.println("Addition Using Lambda: "+function.apply(2,3));


        // By using MethodRef method:
        BiFunction<Integer,Integer,Integer> function1= methodRefToStatiMethod::additon;
        System.out.println("Addition Using MethodRef: "+function1.apply(10,3));


    }
}
