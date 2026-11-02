package showroom;

import garage.Car;

//unrelated class
public class Visitor {
    void look() {
        Car car = new Car();

        System.out.println(car.brand);      // OK (public)

        System.out.println(car.speed);
        // ❌ IntelliJ ERROR: 'speed' has protected access in 'Car'

        System.out.println(car.engineType);
        // ❌ IntelliJ ERROR: 'engineType' is not public

        System.out.println(car.keyHash);
        // ❌ IntelliJ ERROR: 'keyHash' has private access in 'Car'
    }
}