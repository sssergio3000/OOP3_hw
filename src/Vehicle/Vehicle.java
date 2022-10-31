package Vehicle;

public class Vehicle {
    int coordX;
    int coordY;
    int price;
    int speed;
    int year;

    public Vehicle(){}

    public Vehicle(int coordX, int coordY, int price, int speed, int year) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }//constructor

    public int getCoordX() {
        return coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }
public void show(){}
}//class
