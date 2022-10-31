package Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(168, 167, 20000, 230, 2010);
        Plane plane = new Plane(28767,98789,40000000,900,2015,10000,200);
        Ship ship = new Ship(98789,87678,2000000,50, 2000,"Hamburg", 1000);
        System.out.println("Car:");
        car.show();
        System.out.println("__________________________________");
        System.out.println("Plane:");
        plane.show();
        System.out.println("__________________________________");
        System.out.println("Ship:");
        ship.show();

    }
}
