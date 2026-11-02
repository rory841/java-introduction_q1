package garage;


// unrelated class in the same package (unrelated means not a subclass of Car)
public class Mechanic {
    static void inspect() {

        System.out.println(Car.brand);      // OK (public)
        System.out.println(Car.speed);      // OK (protected - same package)
        System.out.println(Car.engineType); // OK (default - same package)
        //System.out.println(car.numberPlate);

    }

    public static void main(String[] args) {
        inspect();
    }
}


