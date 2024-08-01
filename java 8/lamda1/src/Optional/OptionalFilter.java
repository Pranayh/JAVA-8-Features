package Optional;

import java.util.Optional;

public class OptionalFilter {

    public static void main(String[] args) {

        // Without Filter
        String result= " abc ";
        if(result != null & result.contains("abc")){
            System.out.println(result);
        }


        // With Filter and map
        Optional<String> optionalStr = Optional.of(result);
        optionalStr.filter(s -> s.contains("abc"))
                .map(String::trim)
                .ifPresent((s1)-> System.out.println(s1));
    }
}
