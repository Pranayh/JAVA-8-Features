package ForeachLoop;

import java.util.ArrayList;
import java.util.List;

public class ListForeachLoop {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Pranay",23));
        personList.add(new Person("Rutik",23));
        personList.add(new Person("Kalpak",20));
        personList.add(new Person("Jack",21));

        // Without Foreach Loop(before java 8):

        for (Person person: personList)
        {
            System.out.println(person);
        }


        // After java 8
        // With Only Lambda Expression:
        System.out.println();
        System.out.println("After java 8");

        personList.forEach((Person person)->{
            System.out.println(person);
        });

        // with Stream and Lambda :
        System.out.println("with Stream and Lambda: ");
        personList.stream().forEach((person)-> System.out.println(person));


        // With stream and Method Ref
        System.out.println("With stream and Method Ref");
        personList.stream().forEach(System.out::println);

    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
