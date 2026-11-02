


package garage;

public class Car {

    public static String brand = "Toyota";     // 1. PUBLIC: Visible to everyone
    protected static int speed = 100;         // 2. PROTECTED: Same package + Child classes
    static String engineType = "V6";           // 3. DEFAULT (no keyword): Same package ONLY
    private static String numberPlate = "ABC-123"; // 4. PRIVATE: Inside Car.java ONLY

    public static void main() {
        System.out.println(Car.brand);
        System.out.println(Car.speed);
        System.out.println(Car.engineType);
        System.out.println(Car.numberPlate);

        Class1.deets();

    }
}

// unrelated class inside the same file
class Class1{
    public static void deets() {
        System.out.println(Car.brand);
        System.out.println(Car.speed);
        System.out.println(Car.engineType);
        //System.out.println(Car.numberPlate);
    }
}