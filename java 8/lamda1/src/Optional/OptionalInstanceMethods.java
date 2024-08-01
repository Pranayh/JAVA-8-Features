package Optional;

import java.util.Optional;

public class OptionalInstanceMethods {

    public static void main(String[] args) {
        String email2= null;
        Optional<String> emailOfNullable = Optional.ofNullable(email2);

        // 1)isPresent() checks optional null or not, if null then return True otherwise false
//        if(emailOfNullable.isPresent()){
//            System.out.println(emailOfNullable.get());
//        }
//        else{
//            System.out.println("email2 is null");
//        }




        // 	2)orElse(T other)
        //Return the value if present, otherwise return our provided default.

        System.out.println(emailOfNullable.orElse("defalt@gmail.com"));


        // The only difference btn orElse and orElseGet is orElse take parameter as String and orElseGet takes as Supplier using lambda.


        //3) T	orElseGet(Supplier<? extends T> other)
        //Return the value if present, otherwise invoke other and return the result of that invocation.

        //System.out.println(emailOfNullable.orElseGet(()->"defalt@gmail.com"));



//       4)  T	orElseThrow(Supplier<? extends X> exceptionSupplier)
//        Return the contained value, if present, otherwise throw an exception to be created by the provided supplier.

        //System.out.println(emailOfNullable.orElseThrow(()-> new NullPointerException("Your Optional is Null")));



//        5) ifPresent(Consumer<? super T> consumer)
//        If a value is present, invoke the specified consumer with the value, otherwise do nothing.

//        Optional<String> emaildemo= Optional.of("arun@gmail.com");
//
//        emaildemo.ifPresent((s)-> System.out.println("Value is present i.e "+s));

    }
}
