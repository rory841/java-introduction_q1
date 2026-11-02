package garage;

public class Toyota extends Car{
    static void inspect() {

        System.out.println(Car.brand);      // OK (public)
        System.out.println(Car.speed);      // OK (protected - same package)
        System.out.println(Car.engineType); // OK (default - same package)
        //System.out.println(Car.numberPlate); error - private

    }
}
