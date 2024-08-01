package SomefunctionalInterface;


import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String[] args) {

        Consumer<String> consumer = (s)-> System.out.println("This is My Consumer String: "+s);
        consumer.accept("Pranay");


    }
}
