package MethodRef;

@FunctionalInterface
interface Pritable{
    public void print(String s);

}

public class methodRefToInstanceOfObject {

    public void display(String s){
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {

        methodRefToInstanceOfObject methodRefToInstanceOfObject= new methodRefToInstanceOfObject();

        // By using Lambda method:
        Pritable pritable = (s) -> methodRefToInstanceOfObject.display(s);
        pritable.print("bappa morya!");


        // By Using MethodRef Method:
        Pritable pritable1 = methodRefToInstanceOfObject::display;
        pritable.print("ganapati bappa morya!");
    }
}
