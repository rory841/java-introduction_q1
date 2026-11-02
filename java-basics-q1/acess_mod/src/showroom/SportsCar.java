package showroom;

import garage.Car;

//(Subclass in a different package)
public class SportsCar extends Car{
    void drive(){
        System.out.println(brand); // public
        System.out.println(speed); // protected (subclass) different package
        //System.out.println(engineType);
        //System.out.println(numberPlate);
    }
}
