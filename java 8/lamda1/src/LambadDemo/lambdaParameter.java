package LambadDemo;

interface Adable{
    int addition(int a,int b);
}

public class lambdaParameter {

    public static void main(String[] args) {

//        lambadDemo.Adable adable= (a,b) -> (a+b);
//        int result=adable.addition(1,2);
//        System.out.println(result);


        // Multiple statement under Lambda

        Adable adable = (a,b) ->{
            int c = a+b;
            return c;
        };
        int result=adable.addition(1,2);
        System.out.println(result);
    }
}
