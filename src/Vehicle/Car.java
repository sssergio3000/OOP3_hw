package Vehicle;

public class Car extends Vehicle{

    public Car(int coordX, int coordY, int price, int speed, int year) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }//constructor

    public void show(){
        System.out.println("year: "+this.getYear());
        System.out.println("speed: "+this.getSpeed());
        System.out.println("price: "+this.getPrice());
        System.out.println("coord_X: "+this.getCoordX());
        System.out.println("coord_Y: "+this.getCoordY());
    }

}//class
