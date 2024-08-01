package Optional;

import java.util.Optional;

public class OptionalBasic {

    public static void main(String[] args) {

        // Static Methods of Optional

        // 1) empty : it returns empty optional string if optional is empty
        

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);




        // 2) of : if optional is not null then it gives optional string and if null then it gives NullPointer Exception

        String email=null;
        Optional<String> emailOptional = Optional.of(email);  // it adds variable to optional
        System.out.println(emailOptional);

        // get(): it get only the value of optional otherwise throw NoSuchElementException
        System.out.println(emailOptional.get());


        //3) ofNullable: it works  both, if it has value then it returns optional total string
        // otherwise returns empty optional.(Not error)

        String email2=null;
        Optional<String> emailOfNullable = Optional.ofNullable(email2);
        System.out.println(emailOfNullable);


    }
}
