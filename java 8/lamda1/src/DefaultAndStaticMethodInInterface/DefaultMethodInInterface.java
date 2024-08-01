package DefaultAndStaticMethodInInterface;


// 1) The default methods : were introduced to provide backward comparability(changes that not
// going to affect already written code) so that existing
// interfaces can use the lambda expressions without implementing the methods
// in the implementation class. Default methods are also known as defender methods or
// virtual extension methods . exactly - "for backward compatibility"

// we can override default already implemented methods further in below class.



interface vehicle{

    public String CarBrand();
    public String CarColor();

    // Default method
    default String CarOn(){
        return "Car Started by itself";
    }

    default String carOff(){
        return "Car Stopped";
    }


    // Static method
    static String carPurchase(){
        return "Car Owner";
    }
}

class Car implements vehicle
{

    @Override
    public String CarBrand() {
        return "BMW";
    }

    @Override
    public String CarColor() {
        return "Black";
    }

    // we can override default method which is already implemented
    @Override
    public String CarOn(){
        return "Car Started by me";
    }


}


public class DefaultMethodInInterface {

    public static void main(String[] args) {

        Car car = new Car();
        vehicle veh = new Car();
        System.out.println(car.CarBrand());
        System.out.println(car.CarColor());


        // Default methods in Interface : can run on class ref
        System.out.println(car.CarOn()); // it runs method from class, because of class ref
        System.out.println(car.carOff());

        System.out.println(veh.CarOn());  // it runs method from class only because default is
        // used when don't implement that same method


        // Static Method in Interface: have to use interface name
        // work with class ref as well as interface ref

        System.out.println(vehicle.carPurchase());


        
    }

}
