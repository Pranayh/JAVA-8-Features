package LambadDemo;


interface Shape{
    void draw();
        }


public class lamdaOne {
    public static void main(String[] args) {

        print( () -> System.out.println("this is square"));
        print(() -> System.out.println("this is circle"));

        }

    private static void print(Shape shape){
        shape.draw();
    }


    }
