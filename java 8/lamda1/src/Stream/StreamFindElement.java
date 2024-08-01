package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindElement {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(9,2,3,4);


        // findFirst

        Optional<Integer> element=list.stream().findFirst();
        if(element.isPresent()){
            System.out.println(element.get());
        }
        else{
            System.out.println("Stream is Empty");
        }


        // findAny

        Optional<Integer> elementAny=list.stream().findAny();
        if(elementAny.isPresent()){
            System.out.println(elementAny.get());
        }
        else{
            System.out.println("Stream is Empty");
        }



    }
}
