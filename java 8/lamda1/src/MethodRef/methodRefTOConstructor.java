package MethodRef;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class methodRefTOConstructor {

    public static void main(String[] args) {
        List<String> fruits= new ArrayList<>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("Banana");
        fruits.add("mango");

        System.out.println(fruits);


        //  Using Lambda function:
        Function<List<String>, Set<String>> setFunction = (fruitList) -> new HashSet<>(fruitList);
        System.out.println(setFunction.apply(fruits));


        // Using MethodRef to Constructor
        Function<List<String>, Set<String>> setFunctionRef = HashSet::new;
        System.out.println(setFunctionRef.apply(fruits));

    }

}
