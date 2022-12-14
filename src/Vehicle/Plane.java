package Vehicle;

public class Plane extends Vehicle{
    int height;
    int passNum;
    public Plane(int coordX, int coordY, int price, int speed, int year, int height, int passNum) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.height = height;
        this.passNum = passNum;
    }//constructor

    public int getHeight() {
        return height;
    }

    public int getPassNum() {
        return passNum;
    }
    public void show(){
        System.out.println("height: "+this.getHeight());
        System.out.println("number of passengers: "+this.getPassNum());
        System.out.println("year: "+this.getYear());
        System.out.println("speed: "+this.getSpeed());
        System.out.println("price: "+this.getPrice());
        System.out.println("coord_X: "+this.getCoordX());
        System.out.println("coord_Y: "+this.getCoordY());
    }
}//class
