package ForeachLoop;

import java.util.HashMap;
import java.util.Map;

public class MapForeachLoop {
    public static void main(String[] args) {
        Map<Integer,Person> personMap = new HashMap<Integer, Person>();

        personMap.put(1, new Person("Pranay",23));
        personMap.put(2, new Person("Tanay",21));
        personMap.put(3, new Person("Jay",24));

        // Before Java 8
        for (Map.Entry<Integer,Person> entry: personMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


        // After Java 8:

        // using Lambda
        personMap.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
        });



    }
}
