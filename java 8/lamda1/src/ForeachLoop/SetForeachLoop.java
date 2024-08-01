package ForeachLoop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetForeachLoop {
    public static void main(String[] args) {

        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("Pranay",23));
        personSet.add(new Person("Rutik",23));
        personSet.add(new Person("Kalpak",20));
        personSet.add(new Person("Jack",21));

        // Before Java 8
        for (Person person: personSet){
            System.out.println(person);
        }

        // After Java 8
        personSet.forEach((person) -> System.out.println(person)); // lambda
        personSet.stream().forEach(System.out::println); // stream + method ref


        

    }
}
