package MethodRef;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class methodRefToInstanceMethodOfArbitraryObject {

    public static void main(String[] args) {

        Function<String,String> function= (String s)-> s.toUpperCase();
        System.out.println(function.apply("Bappa Morya!"));

        Function<String,String> function1= String::toUpperCase;
        System.out.println(function1.apply("Bappa Morya!"));

        List<String> words = Arrays.asList("apple", "banana", "orange", "kiwi");
        words.sort(String::compareToIgnoreCase);


        for(int i=0;i<words.size();i++){
            System.out.println(words.get(i));
        }
    }
}
